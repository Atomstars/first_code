package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterndCount {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Akash","Aysha","Taara","Aish","Laav");
            
        long count = list.stream().filter(name->name.startsWith("A")).map(String::toUpperCase).count();
        System.out.println(count);
    }
}
