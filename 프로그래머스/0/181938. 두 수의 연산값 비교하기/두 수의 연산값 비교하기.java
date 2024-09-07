class Solution {
    public int solution(int a, int b) {
        // a ⊕ b를 계산
        int concatValue = Integer.parseInt(String.valueOf(a) + String.valueOf(b));

        // 2 * a * b를 계산
        int productValue = 2 * a * b;

        // 두 값 중 더 큰 값을 반환, 같으면 concatValue를 반환
        return Math.max(concatValue, productValue);
    }
}