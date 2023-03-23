package task2;

import java.util.Scanner;

public class Service {

    public String whatsName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String typeIn = scanner.nextLine();
        scanner.close();
        String hi = "Привет";
        String name = "Вячеслав";
        String result = new String();
        String otherName = "Нет такого имени";

        if (typeIn.equals(name)) {
            result = hi + ", " + name;
        } else {
            result = otherName;
        }
        return result;
    }
}
