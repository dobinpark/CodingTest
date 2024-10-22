class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int num : numbers) {
            answer -= num; // numbers에 있는 숫자들을 빼줌
        }

        return answer;
    }
}