package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {
    
    public static void main(String[] args) {
        int num[] = {1,4,5,8};
        System.out.println("Yoo..! The missed no's are :"+miss(num));
    }
    public static List<Integer> miss(int num[]){
        Set<Integer>miss = new HashSet<>();
        List<Integer>missed = new ArrayList<>();
        for(int nums:num){
            miss.add(nums);
            System.out.println(nums);
            
        }
        
        for(int i=1; i<=8 ; i++){
            if(!miss.contains(i)){
                missed.add(i);
            }
            

        }
        return missed;

        
    }
    
}
