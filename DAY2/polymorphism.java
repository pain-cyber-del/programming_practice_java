import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Dog: ");
        int choice = sc.nextInt();

        Animal a;

        if (choice == 1)
            a = new Dog();
        else
            a = new Animal();

        a.sound();
    }
}