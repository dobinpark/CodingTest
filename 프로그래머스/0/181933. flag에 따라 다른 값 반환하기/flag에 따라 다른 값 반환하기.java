class Solution {
    public int solution(int a, int b, boolean flag) {
        // flag가 true이면 a + b를 반환, false이면 a - b를 반환
        return flag ? a + b : a - b;
    }
}
