public class Add {
    public static void main(String args[]){
        int x = 1;
        int y = 2;
        
        System.out.println("addition is"+add(x,y)); // method calling .. does not need to have a int type
    }

    public static int add(int x, int y){ //  method defining .. need to have a int type
         
        int sum= x + y;
         return sum;
        

    }
     
}
