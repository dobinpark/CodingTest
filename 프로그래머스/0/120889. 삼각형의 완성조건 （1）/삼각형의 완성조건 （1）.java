import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        int a = sides[2];
        int b = sides[0] + sides[1];

        if (a < b) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}