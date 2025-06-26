
public class VowelsandConsonents {
    public static void main(String[] args) {
        String str = "apple";
        int[] result = count(str);
        
           System.out.println("Count vowels : " + result[1] );
           System.out.println("Count conso : "+ result[0]);
    }
    public static int[] count(String str){
        char ch[] = str.toCharArray();
        int countv = 0;
        int countcon = 0;
        for ( int i=0;i<ch.length;i++){
            ch[i] = Character.toLowerCase(ch[i]);
            if(ch[i]>='a' && ch[i]<='z'){
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
                    countv++;
                
                }
                else {
                  countcon++;
                }
                

            }
            
            


        }
        return new int[]{countcon,countv};



        


       

    }
    

    
    
}
