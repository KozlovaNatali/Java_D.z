// Задача 1:
// Вычислить n-ое треугольного число 
// (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        
        int summaNumber = 0;
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            summaNumber += i;
            factorial *= i;
        }
        
        System.out.println("Сумма чисел от 1 до " + n + " = " + summaNumber);
        System.out.println("Произведение чисел от 1 до " + n + " = " + factorial);
    }
}