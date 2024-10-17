class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] chars = str.toCharArray();

        int[] answer = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            answer[i] = chars[chars.length - 1 - i] - '0';
        }

        return answer;
    }
}