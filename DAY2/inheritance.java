import java.util.Scanner;

class Person {
    String name;

    void getName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    void display() {
        System.out.println("Name: " + name);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        s.getName(name);
        s.display();
    }
}