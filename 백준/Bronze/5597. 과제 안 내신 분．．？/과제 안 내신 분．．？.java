import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> submittedStidemts = new HashSet<>();

        for (int i = 0; i < 28; i++) {
            int t = Integer.parseInt(br.readLine());
            submittedStidemts.add(t);
        }

        int notCount = 0;
        for (int i = 1; i <= 30; i++) {
            if (!submittedStidemts.contains(i)) {
                System.out.println(i);
                notCount++;
                if (notCount == 2) break;
            }
        }
    }
}