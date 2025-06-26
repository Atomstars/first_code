
public class Whitespaces{
    public static void main(String args[]){
        String str = "gh jh"; // gh jh is stored in string pool and str in stack 
         System.out.println("The real word :" + white(str));
         System.out.println("Using replceall :"+ replace(str));


    }
    public static String white(String str){
        // new object is stored in heap memory 
        // white new = reference variable stored in stack memory
        //  direction source : Stack points to Heap and then heap to String pool
        char ch[] = str.toCharArray();
        // defined a new character array which means it'll be like g,h, ,j,h 
        // need to replace the " " to ""
         StringBuilder space = new StringBuilder(); 
         // created a new object of string builder tye 
         for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                space.append(ch[i]);
            }
         }
        
        
        return space.toString() ;
    }
    public static String replace(String str){
        String with = str.replaceAll(" ", "");
        return with;
    }
}