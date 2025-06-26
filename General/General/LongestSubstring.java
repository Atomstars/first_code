package General;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring{
    public static void main(String args[]){
        String str = "abcc";
        System.out.println("Substring Max len is :" + sub(str));
    }
    public static Integer sub(String str){
        Set<Character>set = new HashSet<>();
        int right = 0; int left = 0; int maxlen =0;
        while(right<str.length()){
          if(!set.contains(str.charAt(right))){
            set.add(str.charAt(right));
            right++;
            maxlen = Math.max(maxlen,right-left);
          }
          else {
            set.remove(str.charAt(left));
            left++;
          }


        }
        
        return maxlen;
    }
}