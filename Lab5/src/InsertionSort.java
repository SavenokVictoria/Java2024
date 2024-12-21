public class InsertionSort {
    public static void main(String[] args) {
        long[] arr = {64, 25, 12, 22, 11}; // Приклад масиву для сортування

        insertionSort(arr); // Викликаємо метод для сортування
        printArray(arr); // Виводимо відсортований масив
    }

    // Метод для сортування масиву за допомогою Insertion Sort
    public static void insertionSort(long[] arr) {
        int n = arr.length;

        // Починаємо з другого елемента і вбудовуємо його в відсортовану частину
        for (int i = 1; i < n; i++) {
            long key = arr[i]; // Поточний елемент для вставки
            int j = i - 1;

            // Переміщаємо елементи, які більші за key, на одну позицію вперед
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Вставляємо key на знайдену позицію
            arr[j + 1] = key;
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
