// Class A with arithmetic operations
class A {
    // Method to add two numbers
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method to subtract two numbers
    void sub(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    // Method to multiply two numbers
    void mul(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

// Main class demonstrating composition
public class CompositionDemo {
    // Method that uses class A for arithmetic operations
    void arithmetic(int a, int b) {
        A p = new A(); // Composition
        p.add(a, b);
        p.sub(a, b);
        p.mul(a, b);
    }

    // Main method to run the program
    public static void main(String[] args) {
        CompositionDemo obj = new CompositionDemo();
        obj.arithmetic(10, 20);
        obj.arithmetic(100, 200);
    }
}
