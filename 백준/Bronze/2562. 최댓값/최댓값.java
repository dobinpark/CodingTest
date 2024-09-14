import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 9;
        int[] result = new int[num];

        for (int i = 0; i < num; i++) {
            result[i] = sc.nextInt();
        }

        int max = result[0];
        int maxIndex = 0;

        for (int i = 1; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);
    }
}