package Constructor;

public class Arearec {
    int length;
    int breadth;

    public Arearec(){
        this.length =1;
        this.breadth=1;
    }
    public Arearec(int len, int br){
        this.length = len;
        this.breadth = br;
        
    }
    void calculateArea(){
        System.out.println("Area is "+ length*breadth);
    }
    public static void main(String[] args) {
        Arearec Rec1 = new Arearec();
        Arearec Rec2 = new Arearec(5,4);
        
        Rec1.calculateArea();
        Rec2.calculateArea();
    }
}
