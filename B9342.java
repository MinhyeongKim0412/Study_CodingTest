package July.Study;

import java.util.Scanner;

public class B9342 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt(); // 테스트 케이스의 개수
        scn.nextLine(); // 개행 문자 처리

        for (int i = 0; i < T; i++) {
            String chr = scn.nextLine();
            if (isInfected(chr)) {
                System.out.println("Infected!");
            } else {
                System.out.println("Good");
            }
        }
        scn.close();
    }

    private static boolean isInfected(String chr) {
        return chr.matches("^[A-F]?A+F+C+[A-F]?$");
    }
}
/*
----------------------------------------
 <문제분석>
 [체감 난이도: hard]
1. 염색체: 알파벳 문자열
2. 조건:
   - 문자열은 반드시 'A', 'F', 'C' 문자를 포함해야 한다.
   - 각 문자는 특정 순서로 나타나야 한다: A가 최소 1번, F가 최소 1번, C가 최소 1번 나타나야 하며, 이 순서가 유지되어야 한다.
   - 나머지 문자는 'A'-'F' 범위 내의 알파벳이 될 수 있다.
----------------------------------------
 <설계>
0. 주어진 문자 받아오기
1. 해당 문자열 객체로 담기 -> chr
2. 테스트 케이스의 개수만큼 반복문 사용
3. 해당 문자열이 조건을 만족하는지 확인
   - 정규 표현식을 사용하여 조건을 확인
4. 결과 출력
----------------------------------------
 <구조>
0. import java.util.*;
0. Scanner scn = new Scanner();
1. int T = scn.nextInt();
2. scn.nextLine();
3. for (int i = 0; i < T; i++) {
    String chr = scn.nextLine();
    if (isInfected(chr)) {
        System.out.println("Infected!");
    } else {
        System.out.println("Good");
    }
}
4. private static boolean isInfected(String chr) {
    return chr.matches("^[A-F]?A+F+C+[A-F]?$");
}
*/
