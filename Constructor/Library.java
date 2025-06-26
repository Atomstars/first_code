package Constructor;

public class Library {
    String title;
    String author;
    int year;

    public Library(String title, String author, int year ){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args) {
        Library l1 = new Library("harry", "akash", 2009);
    }
}
