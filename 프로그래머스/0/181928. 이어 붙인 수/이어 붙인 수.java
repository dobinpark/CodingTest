class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String oddStr = "";
        String evenStr = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenStr += num_list[i];
            } else {
                oddStr += num_list[i];
            } 
        }

        int oddNum = oddStr.isEmpty() ? 0 : Integer.parseInt(oddStr);
        int evenNum = evenStr.isEmpty() ? 0 : Integer.parseInt(evenStr);
        
        answer = oddNum + evenNum;
        
        return answer;
    }
}