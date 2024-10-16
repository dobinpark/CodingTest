class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int pC = 0;
        int yC = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pC++;
            } else if (c == 'y') {
                yC++;
            }
        }

        if (pC == yC) {
            answer = true;
        } else {
            answer = false;
        } 

        return answer;
    }
}