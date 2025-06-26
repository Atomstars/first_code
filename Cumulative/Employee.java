package Cumulative;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.event.SwingPropertyChangeSupport;

public class Employee {
    int id;
    String name;
    String department;
    int salary;

    public Employee(int id, String name, String department, int salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return id + " - " + name + " - "+ department + " - " + salary ; 

    }

    public static void main(String[] args) {
        List<Employee>emp = new LinkedList<>();

        emp.add(new Employee(1, "AKash","ULAA", 100000));
        emp.add(new Employee(2, "Ravi", "SBY", 200000));
        emp.add(new Employee(3, "usha", "ULAA", 78965));
        emp.add(new Employee(4, "harsha", "SBY", 12345));

        for( Employee e : emp) {
        System.out.println("Employee details are :"+e);}

        // to print the list of employees more than 50k 
        System.out.println("\nEmployee with salary more than 50k ");
        emp.stream().filter(e->e.salary>50000).forEach(e-> System.out.println(e));

        // to print the avg of all the salaries 
        System.out.println("\nSo the average salary is :");
        double average =  emp.stream().mapToInt(e->e.salary).average().orElse(0);
        System.out.println(average);

        // grouping by department 
        System.out.println("\nEmployee by department :");
        Map<String, List<Employee>>groupedbyDept = emp.stream().collect(Collectors.groupingBy(e->e.department));
        System.out.println(groupedbyDept);

        //highest salary  
        System.out.println("\nHighest salary employee is :");
        Optional <Employee> maxSalaryEmp = emp.stream().max(Comparator.comparingInt(e->e.salary));
        System.out.println(maxSalaryEmp);

        // names in alphabetical order 
        System.out.println("\nAlphabbetical ordered names :");
        List<Employee>names = emp.stream().sorted(Comparator.comparing(e->e.name.toLowerCase())).collect(Collectors.toList());
        System.out.println(names);
        
    }

        
        
    }
    
    

