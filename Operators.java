public class Operators {

    static int a = 10;
    static int b = 5;

    public static void main(String[] args) {

        // Arithmetic Operators
        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // Relational Operators
        System.out.println("\nRelational:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));

        // Logical Operators
        System.out.println("\nLogical:");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b < 0) : " + (a > 0 || b < 0));

        // Assignment Operators
        System.out.println("\nAssignment:");
        int x = 7;
        x += 3; 
        System.out.println("x after += 3 : " + x);
        x -= 2; 
        System.out.println("x after -= 2 : " + x);
    }
}
