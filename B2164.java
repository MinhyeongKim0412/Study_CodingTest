import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.poll());

    }
}
/*
 * <문제분석>
 * -카드개수 --- N개
 * -카드번호 --- 1부터 N까지의 연속된 숫자
 * -카드순서 --- 1부터 N까지 위에서부터 아래로
 * -반복
 * : i는 1부터 N까지
 * -1번째 카드 => 버림 (poll)
 * -2번째 카드 => 스택된 구조 제일 아래로 이동 (poll,add)
 * 
 * <구조설계>
 * 1. 스캐너 & 링크드리스트(큐) 주입
 * 2. 사용자 입력 기능
 * 3. N 입력받기
 * 4. 큐 생성
 * 5. 큐에 숫자(카드번호) 추가 -> 결과값을 큐에 담기
 * 6. 반복문(while) - 1장 남을 때까지 (큐의 크기=카드 개수/가 1이 될때까지)
 * **1) 큐 1번째 요소 - 제거 (poll)
 * **2) 큐 2번째 요소 - 제거 & 맨뒤로 추가 (poll, add)
 * 7. 최종 남은 마지막 카드 출력
 */