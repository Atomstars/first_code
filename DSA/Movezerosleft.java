package DSA;

import java.util.ArrayList;
import java.util.List;

public class Movezerosleft {
    public static void main(String[] args) {
        int num[] = {2,3,4,0,9,0,7,0,1,3,4};
        List<Integer>array = new  ArrayList<>();
        List<Integer>arrays = new ArrayList<>();
        System.out.println("array with left 0s :" + lefty(num, array));
        System.out.println("array with right 0s:"+righty(num,arrays));
    }
    public static List<Integer> lefty(int num[], List<Integer>array){
        int county = 0;
    
         for (int i =0; i <num.length;i++){
            if(num[i]!=0){
                array.add(num[i]);
            }

        }
        for(int i = 0; i<3;i++){
            array.add(0);
            
            
        }
        return array;
    }
    public static List<Integer> righty(int[] num, List<Integer>arrays){
        int count = 0;
        for(int i = 0; i<num.length;i++){
            if(num[i]==0){
                count++;            } // count = 3
                
        }
        
        for(int i= 0;i<count;i++){ // i = 0,1,2 
            arrays.add(0);
            System.out.println(count);

        }
        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                arrays.add(num[i]);
            }
        }
        return arrays;
    }

}