import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class practice3 {
    public static void main(String args[]){
        String str = "A mana is a manay onn the roadd ";
        System.out.println("hooo "+ reversed(str));
    }
    public static StringBuilder reversed(String str){
        String words[] = str.split(" ");
        StringBuilder  sb  = new StringBuilder();
        System.out.println(Arrays.toString(words)); // 
        Set<Character> set = new LinkedHashSet<>(); 
        for( String word : words){ // word : A , mana, is , a , manay, onn, the , roadd
            // for  every word A, mana, is , a , manay, onn, the, roadd --> char must be defined like for mana --> m, a,n,a  
            // have to check the duplicates and remove the dulicates --> m,a,n 
            // then have to put back these chars again as a string using string builder.
            char ch[] = word.toCharArray(); 
            
            //System.out.println(ch);
            for(char c : ch){
                if (!set.contains(c)){
                        set.add(c);
                        
                }
            }
            
            
         
        }
        
            return sb;
    

        }


        
        
}


