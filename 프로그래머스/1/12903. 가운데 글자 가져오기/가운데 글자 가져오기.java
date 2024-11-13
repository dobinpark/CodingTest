class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int middle = length / 2;

        if (length % 2 == 1) {
            answer = String.valueOf(s.charAt(middle));
        } else {
            answer = s.substring(middle - 1, middle + 1);
        }

        return answer;
    }
}