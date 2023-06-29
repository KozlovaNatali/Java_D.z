import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = {10, 4, 2, 12, 3};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("sort_log.txt"));

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Обмен значениями
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }

                writer.write("Iteration " + (i + 1) + ": ");
                for (int num : array) {
                    writer.write(num + " ");
                }
                writer.newLine();
            }

            writer.close();
            System.out.println("Сортировка завершена. Результаты записаны в лог-файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}