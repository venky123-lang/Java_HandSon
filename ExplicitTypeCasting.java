package my_project;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double doubleNumber = 3.75;
        int intNumber = (int) doubleNumber; // Explicit type casting (double to int)
        
        System.out.println("Original double: " + doubleNumber);
        System.out.println("Explicitly cast int: " + intNumber);
    }
}
