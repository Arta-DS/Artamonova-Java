package task2;

public class Main {

    public static void main (String[] args) {
        Service service = new Service();
        String whatsName = service.whatsName();
        System.out.println(whatsName);
    }
}
