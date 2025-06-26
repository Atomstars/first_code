package Constructor;

public class Student {
    String name;
    int rollNumber;
    String course;

    public Student(String name, int rollNo, String course){
        this.name = name;
        this.rollNumber = rollNo;
        this.course = course;
    }

    void displaydetails()
    {
        System.out.println("Student S1 Details are :"+ name+" " + rollNumber+" " +course);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Akash",89,"ece");
        Student s2 = new Student("kavi",99,"kkk");

        s1.displaydetails();
        
    }
}
