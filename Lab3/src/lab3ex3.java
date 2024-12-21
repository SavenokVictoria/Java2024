import java.util.Scanner; //  клас Scanner для введення з консолі
import java.lang.Math; //  математичні функції
public class lab3ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створює об'єкт Scanner для читання з консолі

        System.out.print("Введіть значення z: "); // Запитує у користувача значення z
        double z = scanner.nextDouble(); // Зчитує введене значення
        for (int k = 1; k < 15; k++) {
            try {
                double result = calculateSeriesSum(z, k); // Викликає метод для обчислення суми ряду
                System.out.printf("Сума ряду для k = %d і z = %.2f дорівнює: %.4f%n", k, z, result);
            } catch (IllegalArgumentException e) {
                System.err.println("Помилка: " + e.getMessage()); // Виводить повідомлення про помилку
            }
        }

        scanner.close(); // Закриває сканер після завершення введення
    }

    // Метод для обчислення суми ряду
    public static double calculateSeriesSum(double z, int k) {
        // Перевіряє, чи правильні значення для параметрів
        if (z <= 0) {
            throw new IllegalArgumentException("Значення z має бути більше 0."); // виняток при z менше, або рівне 0
        }
        double sum = 0; // Змінна для накопичення суми

        for (int i = 1; i <= k; i++) {
            double term1 = 1 / Math.sqrt(z * i); // Обчислює перший член ряду
            double term2 = Math.tan(k / (double)i); // Обчислює другий член ряду
            sum += term1 + term2; // Додає обидва члени до суми
        }

        return sum; // Повертає кінцевий результат
    }
}