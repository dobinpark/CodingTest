import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int j = 1;

        String str = "";

        for (int i = 1; i <= b; i++) {
            for (j = 1; j <= a; j++) {
                str += "*";
            }
            System.out.println(str);
            j = 0;
            str = "";
        }
    }
}