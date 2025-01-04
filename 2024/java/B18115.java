import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B18115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                deque.addFirst(i);
            } else if (num == 2) {
                int top = deque.removeFirst();
                deque.addFirst(i);
                deque.addFirst(top);
            } else {
                deque.addLast(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (deque.size() != 0) {
            sb.append(deque.removeFirst() + " ");
        }

        System.out.println(sb);
    }
}
/*
 * <문제 분석>
 * - 카드 작업 처리
 * - 스택과 큐 알고리즘 사용
 * - 역순 처리 필요
 * 
 * <알아야 할 것>
 * 1) 초기 카드 상태: 1부터 N까지 위에서 아래로 쌓여 있음
 * 2) 기술 사용 순서: 카드 위치 조정
 * 3) 최종 카드 상태: 모든 작업 후 카드 순서 출력
 * 
 * <작업 타입>
 * - 0: 카드 X를 제일 위에 추가
 * - 1: 카드 X를 제일 아래에 추가
 * - 2: 카드 X를 제일 위에서 X번째 위치에 추가
 * - 3: 카드 X를 제일 아래에서 X번째 위치에 추가
 * 
 * <카드 배치 예시>
 * - 작업에 따른 카드 순서 변화
 * 
 * N = 카드 개수
 * i = 카드 작업 순서
 * x = 카드 번호 또는 위치
 */
```
