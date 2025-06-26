package Cumulative;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Reverse {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please Enter the String ");
         String str = scanner.nextLine();
         scanner.close();
         System.out.println("Your Entered String is :" + str);
         System.out.println("duplicates removed and reversed string is :"+ rev(str));
        }
        public static StringBuilder rev(String str){
            // thiss iss coddiingg 
            // thiss;iss;coddiingg
            // t,h,i,s,s || i,s,s || c,o,d,d,i,i,n,g,g
            // t,h,i,s => should be kept in one as a string as same for others even
            // this ; is; coding => three saperate strings and now has to store in as Big string 


            String words[] = str.split(" ");
            StringBuilder result = new StringBuilder();
            for(String word : words){
                Set<Character>set = new LinkedHashSet<>();
                StringBuilder cleaned = new StringBuilder();
                  for(char c : word.toCharArray()){
                    if (!set.contains(c)){
                        set.add(c);
                        cleaned.append(c);
                    }
                    
                  }
                  System.out.println(cleaned);
                  cleaned.reverse();
                  result.append(cleaned).append(" ");
                  for(int i = 0; i<result.length();i++){
                    int count = 0;
                    int cons = 0;
                    char ch[] = word.toCharArray();
                    if(ch[i]>='a' && ch[i]<='z'){
                        if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ){
                              count++ ;
                        }
                        else {
                        cons++;
                        }
                    }System.out.println(count+cons);
                  }
            }
            return result;
        }
    


        
    
}
