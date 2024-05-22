// This program demonstrates logical operators in Java.
class logic {
    public static void main(String a[]) {
        int i = 12;
        int b = 6;
        int c = 18;
        boolean result_a = i > c && b < i;             // Logical AND operator
        boolean result_b = i < c || i > b;             // Logical OR operator
        boolean result_c = !(c < i);                   // Logical NOT operator
        boolean result_t = i > 5 || b < c && !(c < 12); // Complex logical expression
        // Output the results
        System.out.println(result_a);
        System.out.println(result_b);
        System.out.println(result_c);
        System.out.println(result_t);
    }
}
