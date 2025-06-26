package Constructor;

public class constructor {
    String Person;
    int age;
    String Name;

    public constructor(int age, String Name){
        this.age = age;
        this.Name = Name;
    }
    void display(){
        System.out.println("name"+Name);
    }

public static void main(String[] args) {
    constructor obj = new constructor(10, "akash");
    obj.display();
}
}