import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        while (scanner.hasNext()) {
            String s = scanner.next();
            int i = scanner.nextInt();

            System.out.printf("%-15s%03d%n", s, i);
        }
        System.out.println("================================");

        scanner.close();
    }
}



