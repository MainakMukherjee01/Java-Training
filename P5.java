import java.util.*;

class Person{
    
    static int count=0;
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Details of person["+count+"]: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    void increaseCount(){
        count++;
    }
}

public class P5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person 1: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the person 1: ");
        int age = sc.nextInt();
        Person p1 = new Person(name, age);
        p1.increaseCount();
        p1.display();
        
        System.out.println("Enter the name of the person 2: ");
        name = sc.next();
        System.out.println("Enter the age of the person 2: ");
        age = sc.nextInt();
        Person p2 = new Person(name, age);
        p2.increaseCount();
        p2.display();

        sc.close();
        
    }
    
}
