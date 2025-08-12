public class ArrayExamples {
    public static void main(String[] args) {
        
        // Integer array
        int[] numbers = {10, 20, 30, 40};
        
        // Double array
        double[] prices = {19.99, 29.50, 15.75};
        
        // Char array
        char[] grades = {'A', 'B', 'C'};
        
        // Boolean array
        boolean[] flags = {true, false, true};
        
        // String array
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // Printing integer array
        System.out.println("Integer Array:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Printing double array
        System.out.println("\nDouble Array:");
        for (double price : prices) {
            System.out.println(price);
        }
        
        // Printing char array
        System.out.println("\nChar Array:");
        for (char grade : grades) {
            System.out.println(grade);
        }
        
        // Printing boolean array
        System.out.println("\nBoolean Array:");
        for (boolean flag : flags) {
            System.out.println(flag);
        }
        
        // Printing string array
        System.out.println("\nString Array:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
