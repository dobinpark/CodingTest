import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int j = 0; j < num.length; j++) {
            if (v == num[j]) {
                result += 1;
            } else {
                continue;
            }
        }

        System.out.println(result);
    }
}