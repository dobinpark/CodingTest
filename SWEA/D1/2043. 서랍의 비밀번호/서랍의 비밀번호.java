import java.util.Scanner;

public class Solution {
    public static void main(String args[])	{

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), k = sc.nextInt();
        int count = 0;

        for (int i = p; i >= k; k++) {
            count += 1;
        }

        System.out.println(count);
    }
}