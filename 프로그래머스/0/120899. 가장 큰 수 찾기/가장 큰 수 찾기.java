class Solution {
public int[] solution(int[] array) {
        int[] answer = {};
        int max = 0;
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                continue;
            } else if (max < array[i]) {
                max = array[i];
                index = i;
            }

            answer = new int[]{max, index};
        }
        
        return answer;
    }
}