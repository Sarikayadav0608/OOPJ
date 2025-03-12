public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intVar = 30;
        double doubleVar = intVar;  // No explicit cast needed
        System.out.println("Implicit casting (int to double): " + doubleVar);

        // Explicit Type Casting (Narrowing)
        double doubleValue = 9.99;
        int intValue = (int) doubleValue;  // Explicit cast needed
        System.out.println("Explicit casting (double to int): " + intValue);
    }
}