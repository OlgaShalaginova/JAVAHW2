//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.//

package org.example.HW2.Task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.printf("Последовательность " + calculation() + " возрастающей");
    }
    public static String calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите числа: ");
        int number1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int number2 = scanner.nextInt();
            if (number2 <= number1) {
                count++;
            }
            number1 = number2;
        }
        scanner.close();
        if (count == 0) {
            return "является";
        } else {
            return "не является";
        }
    }
}
