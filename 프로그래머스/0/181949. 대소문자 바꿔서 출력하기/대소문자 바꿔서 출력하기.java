import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        StringBuilder result = new StringBuilder();  // StringBuilder로 수정
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // 대문자라면 소문자로 변환
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            // 소문자라면 대문자로 변환
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                // 알파벳이 아닌 다른 문자는 그대로 추가
                result.append(c);
            }
        }
        
        System.out.println(result.toString());
    }
}
