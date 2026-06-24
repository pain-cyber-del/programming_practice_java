import java.util.Scanner;

class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int l = sc.nextInt();

        System.out.print("Enter Width: ");
        int w = sc.nextInt();

        Rectangle r = new Rectangle(l, w);
        r.area();
    }
}