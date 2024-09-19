import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int numResult = a + b - c;

        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);

        int stringResult = Integer.parseInt(strA + strB) - Integer.parseInt(strC);

        System.out.println(numResult);
        System.out.println(stringResult);
    }
}