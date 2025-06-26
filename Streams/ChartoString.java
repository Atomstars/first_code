package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChartoString {
    public static void main(String[] args) {
        List<Character>list = Arrays.asList('v','g','p');
         String add = list.stream().map(String :: valueOf).collect(Collectors.joining());
         System.out.println(add);
    }
}
