package Collections;
import java.util.*;

public class duplist {
    public static void main(String[] args) {
        List<String>input = Arrays.asList("apple","banana","apple","mango");
        Set<String>uniquSet = new LinkedHashSet<>(input);
        List<String>result = new LinkedList<>(uniquSet);
        
        System.out.println(result);
        result.forEach(r->System.out.println(r));
    }
}
