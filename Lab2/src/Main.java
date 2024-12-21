//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class MathExpressionCalculator {
        public static void main(String[] args) {
            // Given values for parameters a, b, c, and d
            double a = -3.45;  // angle in radians
            double b = -2.34;  // some number
            double c = 1.45;   // some constant
            double d = 0.83;   // angle in radians

            // Calculate the final result using the given formula
            double y = (5 * c) / Math.cos(a) + Math.sqrt(Math.sinh(Math.abs(b)) * c / Math.tan(d));

            // Output the final result
            System.out.println("Final result (y): " + y);
        }
    }
}