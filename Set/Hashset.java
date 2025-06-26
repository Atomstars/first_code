package Set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String>mail = new HashSet<>();
        mail.add("akasjsk@12w");
        mail.add("okoko@12");
        mail.add("okoko@12");

        System.out.println("Unique emails");
        for(String email:mail){
            System.out.println(email);
        }
        System.out.println(mail.contains("okoko@12"));


    }
}
