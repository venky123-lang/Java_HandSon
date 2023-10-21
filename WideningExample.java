package my_project;

public class WideningExample {
    public static void main(String[] args) {
        int smallNumber = 5; // An integer (4 bytes)
        double largeNumber = smallNumber; // Widening - int to double
        
        System.out.println("Small number: " + smallNumber);
        System.out.println("Large number (after widening): " + largeNumber);
    }
}

