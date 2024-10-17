import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String[] digits = Long.toString(n).split("");

        Arrays.sort(digits, (a, b) -> b.compareTo(a));

        String sortedStr = Arrays.stream(digits).collect(Collectors.joining());

        long answer = Long.parseLong(sortedStr);

        return answer;
    }
}