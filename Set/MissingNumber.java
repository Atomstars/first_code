package Set;

import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class MissingNumber {
    public static void main(String[] args) {
        int num[]={1,3,4,6};
        System.out.println("Dude the missed number ::: " + missed(num));


    }
    public static Integer missed(int num[]){
        Set<Integer>miss = new HashSet<>();
        for(int nums:num){
            System.out.println(nums);
            miss.add(nums);
        }
    
        for(int i =0;i<=6;i++){
            if(!miss.contains(i)){
                return i;
                
            }
    
        }
        return -1;
    }

}

