package prince1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class array {
    public static void main(String[] args) {
    int num[] ={1,2,3,4,5,6,7};
    int  target = 3;
    System.out.println("the output is :"+solution(num,target));
    System.out.println("with optimized soln from gpt :"+solutionop(num,target));
}
    public static Set<Integer> solution(int num[], int target){
        // num[] = 1,2,3,4,5,6,7
        Set<Integer>set = new LinkedHashSet<>();
        
        while(target<num.length){ // target = 3 < 7
            if(!set.contains(num[target])){  // num[3] = 4 
                 set.add(num[target]);
                 target++; // target = 4 
            }
        }
        for(int i= 0 ;i<target;i++){
            if(!set.contains(num[i])){
                set.add(num[i]);
                
            }
        }
        System.out.println(set);
        

        return set;

    }

    public static Set<Integer> solutionop(int num[],int target){
        Set<Integer>sets = new LinkedHashSet<>(); // {1,2,3,4,5,6,7} //target = 3
        
        for(int i = 0;i<num.length;i++){
         int newset=  (target+i)%num.length;
         sets.add(num[newset]);
          
        }

        return sets;
    }


}
