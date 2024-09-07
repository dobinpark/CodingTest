class Solution {
   public int solution(String ineq, String eq, int n, int m) {
        // ">" 또는 "<"로 주어지는 ineq와 "=" 또는 "!"로 주어지는 eq를 조합하여 조건을 평가합니다.
        if (ineq.equals(">") && eq.equals("=")) {
            return n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return n < m ? 1 : 0;
        }

        // 주어진 조건 이외의 경우는 없으므로 기본적으로 0을 반환하도록 설정합니다.
        return 0;
    }
}