class Solution {
    public String solution(String code) {
        
        int mode = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);

            if (mode == 0) {
                if (currentChar == '1') {
                    mode = 1;
                } else if (i % 2 == 0) {
                    answer.append(currentChar);
                }
            } else {
                if (currentChar == '1') {
                    mode = 0;
                } else if (i % 2 != 0) {
                    answer.append(currentChar);
                }
            } 
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}