import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1 + n2));

        }
    }
}