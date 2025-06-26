
public class reversestr {
    public static void main(String[] args) {
        String str = "weeliers";
        System.out.println("Reversed is :"+ recursive(str));
        System.out.println("Again reversed to original:"+ original(str));
    }
    public static String reverse(String str){
        
        char ch[] = str.toCharArray(); // ch[] == w,e,e,l,e,r,s
        int left = 0;
        int right = str.length()-1;
        
        while (left<right){ // 0 ---> 6 .. w e e l e r s

         char x = ch[left] ; // x = w
         ch [left] = ch[right];// s e e l e r s
         ch[right] =  x; // seelerw

         left ++;
         right --;
         }
         return new String(ch);
    }
    public static String original(String str){
        
        return str;
    }
    
    public static String reversed(String str){
        char ch[]= str.toCharArray();
        char rev[]=new char[ch.length]; // w,e,e,l,i,e,r,s
        for(int i=ch.length-1,j=0;i>=0;i--,j++){ // 00-->6
            
            rev[j]= ch[i]; // ch[6] = s
         }
        
        return new String(rev);
    }
    public static String stringbuffer(String str){
        StringBuffer sb = new StringBuffer("weeliers");
        String reveresed = sb.reverse().toString();
        return new String(reveresed);
    }

    public static String recursive(String str){
        if(str.length()<=1){
            return str;
        }
        return recursive(str.substring( 1))+str.charAt(0);
    }

    }

