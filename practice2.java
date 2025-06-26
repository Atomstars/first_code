import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice2 {
    public static void main(String[] args) {
        String str = "askuias";
        String strr ="ask";
        int num = 89;
        int no[] = {1,4,5,6,7};
        String anaone ="akash";
        String antwo ="aksha";
        String dup = "programming";
        String county = "balloon";

        System.out.println("methodequals : " + equals(str, strr));
        System.out.println("prime check :"+prime(num));
        System.out.println("reverse string str :"+reverse(str));
        System.out.println("vowelss are : "+vowels(str));
        System.out.println("Anargam check is :"+ anargam(anaone, antwo));
        System.out.println("Second highest ?? come on this is your ans :" + second(no));
        System.out.println("Duplicates are removed :" + dupl(dup));
        System.out.println("Count of each char is :"+counts(county));

    }
    
    public static Map<Character, Integer> counts(String county) {
    char[] freq = county.toCharArray();
    Map<Character, Integer> list = new LinkedHashMap<>();

    for (int i = 0; i < freq.length; i++) {
        char c = freq[i];
        if (list.containsKey(c)) 
        { 
            list.put(c, list.get(c) + 1); //  increase that character's count
        } else {
            list.put(c, 1); //  first time: count = 1
        }
    }

    return list;
}

    public static Set<Character> dupl(String dup){
        char dp[] = dup.toCharArray();// { p,r,o,g,r,a,m,m,i,n,g}
        Set<Character>set = new LinkedHashSet<>();
        for(int i  = 0;i<dp.length;i++){
            if(!set.contains(dp[i])){ // p,r,o,g .... when it comes to r ... 
            set.add(dp[i]);
            }


        }
       

        
        return set;
    }
    
    public static boolean equals ( String str, String strr){
        String strrr = new String ("ask");
        if (str.equals(strr)){
            System.out.println(str==strrr); 
            System.out.println(strr==strrr);
            System.out.println(str.equals(strrr));
            return true;

        }
        return false;
    }
    public static boolean prime(int num){
        if(num<=1){
        return false;
        }
        else{
            for(int i = 2; i<=num ; i ++){
                if(num % i == 0){
                    return false;
                }

            }
            return true;
        }
    }

    public static String reverse (String str ){
        char ch [] = str.toCharArray(); // a,s,k,u,i,a,s
        int right = 0;
        int left = str.length()-1;
        
        System.out.println(ch[right]);
        while(right<left){
        char x  = ch[right]; // x = a
        ch[right] = ch[left]; // sskuias
        ch[left] = x; // sskuiaa //saiuksa
        right++;
        left--; //saiuksa 
        }

        

        return new String(ch);

    }
    public static Integer vowels(String str){
        char ch[] = str.toCharArray(); // saiuksa
        int count = 0;
        for(int i = 0; i <str.length();i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' )
                {
                    count ++;
                }
            }
        }

        return count;

    }
    public static boolean anargam(String anaone, String antwo){
        char ch1[] = anaone.toCharArray();
        char ch2[] = antwo.toCharArray();
        for(int i = 0; i<ch1.length;i++){
            ch1[i]=Character.toLowerCase(ch1[i]);
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                return true;
            }


        }
        return false;
    }
    public static Integer second(int[] no){
        System.out.println(no[2]); // 14567
        int sec= no.length;
            Arrays.sort(no);
            System.out.println(Arrays.toString(no));
           
            int secs = no[sec-2];
            return secs;
        

    }
    
}
