package task1;

import java.util.Scanner;

public class Service {

    public String printHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int dataInput = scanner.nextInt();
        scanner.close();
        String hi = "Привет";
        String result = new String();
        if (dataInput > 7) {
            result = hi;
        }
        return result;
    }
}