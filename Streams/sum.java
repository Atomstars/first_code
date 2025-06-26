package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum {
public static void main(String[] args) {
    List<Integer>list = new ArrayList<>();
    list.add(5);
        list.add(8);
            list.add(14);
    
    int result = list.stream().filter(num->num%2==0).reduce(0, (a,b)->a+b);
    System.out.println(result);


}
    
}
