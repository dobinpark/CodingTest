import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        int min = list.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        list.remove(Integer.valueOf(min));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}