package task3;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Service {
    public static int[] getArray() {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите число, чтобы задать длину массива");
        int size = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
        return arr;
    }
}
