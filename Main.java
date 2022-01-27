import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String fizz = "Fizz";
        final String buzz = "Buzz";
        final int dev3 = 3;
        final int dev5 = 5;
        int startIncl = scanner.nextInt();
        int endIncl = scanner.nextInt();
        for (int i = startIncl; i <= endIncl; i++) {
            if (i % dev3 == 0 && i % dev5 == 0) {
                System.out.println(fizz + buzz);
            } else {
                if (i % dev3 == 0) {
                    System.out.println(fizz);
                } else if (i % dev5 == 0) {
                    System.out.println(buzz);
                } else {
                    System.out.println(i);
                }
            }

        } scanner.close();
    } 
}
