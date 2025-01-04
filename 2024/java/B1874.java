package July.complete;

import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 수열의 크기 n을 입력받음
        int n = sc.nextInt();

        // 수열을 저장할 배열 생성
        int[] sequence = new int[n];

        // 수열을 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        // 스택을 이용하여 수열을 만들기 위한 스택 객체 생성
        Stack<Integer> stack = new Stack<>();

        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder result = new StringBuilder();

        // 현재 스택에 넣을 수 있는 수를 나타내는 변수
        int current = 1;

        // 수열을 만들 수 있는지 여부를 나타내는 변수
        boolean possible = true;

        // 입력받은 수열을 하나씩 처리
        for (int num : sequence) {
            // 현재 수까지 스택에 푸시
            while (current <= num) {
                stack.push(current++);
                result.append("+\n"); // 푸시 연산을 기록
            }

            // 스택의 맨 위의 수가 현재 수와 같으면 팝
            if (stack.peek() == num) {
                stack.pop();
                result.append("-\n"); // 팝 연산을 기록
            } else {
                // 스택의 맨 위의 수가 현재 수와 다르면 수열을 만들 수 없음
                possible = false;
                break;
            }
        }

        // 수열을 만들 수 있으면 결과 출력, 그렇지 않으면 "NO" 출력
        if (possible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
    }
}