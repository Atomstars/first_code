package prince1;

import java.util.Arrays;

public class upperlower {
    public static void main(String[] args) {
        String str = "the java is 13 times @java";
        System.out.println("Okay princy the soln is : "+solution(str));
    }
    public static String solution(String str){
        String words[ ]= str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String word : words){
            String strs = word.toUpperCase();
            sb.append(strs).append(" ");
        }
        return sb.toString();

    }
    
}
