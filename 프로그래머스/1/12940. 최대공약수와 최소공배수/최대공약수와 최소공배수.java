class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n, m), lcm(n, m)};

        return answer;
    }

    // 최대 공약수 구하는 메서드
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    // 최소 공배수 구하는 메서드
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}