import java.util.Scanner;

abstract class Shape {
    abstract void area(int side);
}

class Square extends Shape {
    void area(int side) {
        System.out.println("Area = " + (side * side));
    }
}

public class abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side: ");
        int side = sc.nextInt();

        Shape s = new Square();
        s.area(side);
    }
}