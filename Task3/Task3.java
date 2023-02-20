//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.//

package org.example.HW2.Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = { 0, 10, -45, 66, 9, -12, 6, 80};
        int[] newArray = new int[array.length];
        int sum = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            newArray[i] = array[i];
            if (array[i] < 0) {
                array[i] *= -1;
            }
            if (String.valueOf(array[i]).length() == 2) {
                sum += i;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 0) {
                newArray[i] = sum;
            }
        }
        System.out.println(" ");
        System.out.print("Новый массив: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
