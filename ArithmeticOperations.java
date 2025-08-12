public class ArithmeticOperations {

    public static void performOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        
    }

    public static void main(String[] args) {
        int num1 = 20, num2 = 5;
        
        
        performOperations(num1, num2);
    }
}
