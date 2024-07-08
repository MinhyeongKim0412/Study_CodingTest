import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        
        for (int i = 0; i < T; i++) {
            String line = br.readLine(); // 괄호 문자열
            if (isBalanced(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        br.close();
    }
    
    // 괄호 문자열이 올바른지 판단하는 함수
    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
