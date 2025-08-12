public class ArithmeticExample {

    // Static variables
    static int num1 = 20;
    static int num2 = 10;

    public static void main(String[] args) {
        
        int sum = num1 + num2;         
        int difference = num1 - num2;  
        int product = num1 * num2;     
        int quotient = num1 / num2;    
        int remainder = num1 % num2;    

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
