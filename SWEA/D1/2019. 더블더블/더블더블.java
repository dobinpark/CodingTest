import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
}
