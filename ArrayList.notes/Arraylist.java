
// Arraylists is a resizeble array. 
// they can grow and shrink dynamically.
// Arrays are fixed in size and Array lists are dynamic in nature 
// ArrayList<String>fruits = new ArrayList<>();

import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        for(int n = 0; n<=fruits.size(); n++){
            String fruit = fruits.get(n);
            System.out.println(fruit);
        }
        System.out.println(fruits); 

        System.out.println(fruits.get(0)); // get(index) ==> O(1)
        System.out.println(fruits.get(2));

        fruits.set(0, "Grapes"); // set (index) ==> O(1)
        System.out.println(fruits);

        fruits.addAll(fruits);
        System.out.println(fruits); /// adds all fruits. 

        fruits.add(2,"cucumber");
        System.out.println(fruits+"lol cucumber is a fruits?");

        fruits.remove(2);
        System.out.println(fruits);

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        
    }
}

