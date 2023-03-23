package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        int[] myGetArray = service.getArray();
        System.out.println(Arrays.toString(myGetArray));
    }
}
