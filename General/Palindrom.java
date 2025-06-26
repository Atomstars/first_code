
public class Palindrom {
    public static void main(String args[]){
        String str = "madam";
        if(isPalindrom(str))
        {
        System.out.println("yes");
        }
        else 
        {
        System.out.println("no");
        }
    }
    public static boolean isPalindrom(String str){
        char ch [] = str.toCharArray(); // (m,a,d,a,m)
        int right = str.length()-1; 
        int left = 0;
        while(left<right){
            if(str.charAt(right) !=str.charAt(left)){
                
                return false;
                
            }
            right--;
            left++;
            
            }
            return true;
        }
     }
