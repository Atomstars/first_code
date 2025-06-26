public class Countoccurances{
    public static void main(String[] args) {
        String str = "hellllllllo";
        String word = " hell hell e hllleoi";
        String use = "hell";
        char target = 'l';
        System.out.println("count : "+ count(str, target));
        System.out.println("count of word : "+ countword(word,use));
    }
    public static Integer count(String str, char target){        
        char ch[]=str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){  // compares the values of char and target 
            }

        }
       return count;
     }

    public static Integer countword(String str, String use){
        int counta = 0;
        String words[] = str.split("\\s+"); // words [] = hell, hell, e, hellllle
        for (String wordq:words)
        {
           if(wordq.equals(use)){
            counta++;
           }
        }
        
        return counta;
    }

}