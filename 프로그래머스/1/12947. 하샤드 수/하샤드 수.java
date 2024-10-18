class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int[] n = Integer.toString(x)
                .chars()
                .map(c -> c - '0')
                .toArray();

        int result = 0;
        
        for (int i = 0; i < n.length; i++) {
            result += n[i];
        }

        if (x % result == 0) {
            answer = true;
        } else {
            answer = false;
        } 

        return answer;
    }
}