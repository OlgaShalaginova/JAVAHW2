//Дана последовательность N целых чисел. Найти сумму простых чисел.//

package org.example.HW2.Task1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Сумма простых чисел равна = %d", summa());
    }
    public static int summa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите числа: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            int numberAbs = Math.abs(number);
            int count = 0;
            if (numberAbs > 3) {
                for (int j = 2; j < numberAbs; j++) {
                    if (numberAbs % j == 0) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                sum += number;
            }
        }
        scanner.close();
        return sum;
    }
}
