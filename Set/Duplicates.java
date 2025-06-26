package Set;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int num[] = {1,4,3,5,2,1,2};
        System.out.println("yoo! duplicates there ?: " + dup(num));
    }
    public static boolean dup(int num[]) {
        Set<Integer>dupl= new HashSet<>();
        for(int nums:num){
            if(dupl.contains(nums)){
                return true;
            }
            else{
                dupl.add(nums);
            }
        }

        return false;

        
        }
        
        
        
}
    

