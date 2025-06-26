package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Car {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("benz","bmw","audi","toyota","hunday");
        List<String>car = list.stream().filter(carname -> carname.length()>3).map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(car);
    }
    
}
