package my_project;

public class OverflowExample {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE; // Maximum value for an int
        int incrementedInt = maxInt + 1; // Overflow
        
        System.out.println("Maximum Integer Value: " + maxInt);
        System.out.println("Result of Overflow: " + incrementedInt);
    }
}
