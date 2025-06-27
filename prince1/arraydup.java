package prince1;

import java.util.LinkedList;
import java.util.List;

public class arraydup {
    static int num[]={1,2,3,4,5,5,6,3};// len = 8 --> 0 to 7
    static int target = 3;
    public static void main(String[] args) {
        
       System.out.println("the reversed array is :"+reversed(num,target)); 
    }
    public static List<Integer> reversed(int num[], int target){
        List<Integer>list = new LinkedList<>();
        for(int i = 0  ; i <num.length;i++){
            int index = (target+i)%num.length;
            list.add(num[index]);
        }
        return list;

    }
}
