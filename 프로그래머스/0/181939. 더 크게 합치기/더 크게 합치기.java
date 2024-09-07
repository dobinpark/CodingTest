class Solution {
    public int solution(int a, int b) {
        // a ⊕ b와 b ⊕ a를 계산
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        // 두 값 중 더 큰 값을 반환
        return Math.max(ab, ba);
    }
}
