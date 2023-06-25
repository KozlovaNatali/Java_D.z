// Задача 2:
// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
        System.out.println("Введите число: ");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    boolean b = true;
    for (int j = 2; j <= input; j++) {
        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                b = false;
                break;
            }
        }
        if (b) System.out.println(j);
        else b = true;
        }
    } 
}           

