public class AIM1 {
    public static void main(String[] args) {
        String str = "newen";
        String strr = "madamadam";
        String space ="Spac ewww";
        System.out.println("Reversed is :" + reverse(str));
        System.out.println("Palindrome is :" + palindrom(strr));
        System.out.println("Whitespaces:"+ white(space));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        String newy = sb.reverse().toString();
        
        if ( newy.equals(str)){
            System.out.println("Yes it a palindrome");
        }
        else
        {
            System.out.println("Go go write a code for  palindrome check");
        }

        return newy;

    }

    public static boolean palindrom(String strr){
         // why cant we use str here ???
        // ch[] ={m,a,d,a,m,a,d,a,m} // 0 = 8, 1 = 7
        int left = 0;
        int right = strr.length()-1; // 8
        while(left<right){
            if(strr.charAt(right)!=strr.charAt(left)){
                return false;
            }
            right--;
            left++;


        }
        return true;
    }
    public static String white(String space){
        char ch[] = space.toCharArray();
        String full = space.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
    
        for(int i = 0;i<=ch.length;i++){
            if(ch[i]!= ' '){
                sb.append(ch[i]);

            }
        }
        return sb.toString();
    }


    
}

    

