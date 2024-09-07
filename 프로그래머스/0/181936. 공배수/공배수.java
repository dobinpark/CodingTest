class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0  && number % m == 0) {
            answer = 1;
        } else if (number % n == 0 || number % m == 1 || number % m == 0 || number % n == 1) {
            answer = 0;
        }

        return answer;
    }
}