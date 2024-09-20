import java.util.Scanner;

class A {
    private int x;

    A(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Value of x: " + x);
    }
}

class B extends A {
    private int y;

    B(int x, int y) {
        super(x);  // Call the constructor of class A
        this.y = y;
    }

    void disp() {
        System.out.println("Value of y: " + y);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for x and y
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();

        // Create an instance of B with user-provided values
        B ob = new B(x, y);

        // Display values
        ob.show();
        ob.disp();

        // Optionally, create another instance of B with user-provided values
        System.out.print("Enter another value for x: ");
        x = scanner.nextInt();

        System.out.print("Enter another value for y: ");
        y = scanner.nextInt();

        B obj = new B(x, y);

        // Display values
        obj.show();
        obj.disp();

        scanner.close();
    }
}
