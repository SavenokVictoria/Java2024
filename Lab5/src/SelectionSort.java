public class SelectionSort {
    public static void main(String[] args) {
        long[] arr = {64, 25, 12, 22, 11}; // Приклад масиву для сортування

        selectionSort(arr); // Викликаємо метод для сортування
        printArray(arr); // Виводимо відсортований масив
    }

    // Метод для сортування масиву за допомогою Selection Sort
    public static void selectionSort(long[] arr) {
        int n = arr.length;

        // Проходимо через всі елементи масиву
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Вважаємо, що мінімум знаходиться на поточній позиції
            // Шукаємо мінімальний елемент у решті масиву
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Оновлюємо індекс мінімуму
                }
            }
            // Обмінюємо місцями елементи
            long temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Метод для виведення масиву
    public static void printArray(long[] arr) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
