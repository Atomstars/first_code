//

import java.util.HashSet;
import java.util.Set;


public class practice1 {
    public static void main(String[] args) {
        String str = "ashbashb"; 
        String strr =  "m,a,d,a,n";
        System.out.println("Longest substring is :"+ substring(str));
        System.out.println("Palindrome:"+ palindrom(strr));
    }
    public static Integer substring(String str){
        Set<Character> set = new HashSet<>();
        char ch[] = str.toCharArray(); // {a,s,...}
        int max = 0;
        int len = str.length(); // 8 
        int right =0;
        int left = 0;
        while(right<len){
            if(!set.contains(ch[right])){
                set.add(str.charAt(right));
                right++;
                max = Math.max(max, right-left);
            }
            else 
            {
              set.remove(ch[left]);
              left++;
            }
            
        }
        
        return max;
    }

    public static boolean palindrom(String strr){
        char ch[] = strr.toCharArray();
        int left = 0;
        int right = strr.length()-1;
        while(right>left){
            if(ch[right] != ch[left]){
                
                
                return false;
                
            }
            right--;
            left++;
            
        }
        return true;
        }
        public static 
}





