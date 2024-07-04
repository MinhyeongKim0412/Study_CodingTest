package July.Study;

import java.util.Scanner;

public class B1929 {
    public static void main(String[] args) {
        // 스캐너 객체를 사용하여 입력받기
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        int N = scn.nextInt();
        scn.close();
        
        // 에라토스테네스의 체 알고리즘을 사용하여 소수 판별
        // 소수인지 여부를 저장할 배열
        boolean[] isPrime = new boolean[N + 1];
        
        // 2부터 N까지의 모든 수를 소수로 초기화
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                // i의 배수들을 소수가 아니라고 표시
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // M부터 N까지의 소수를 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}

/* 
----------------------------------------
<문제분석>
[체감 난이도: easy]
1. 주어지는 수 2개 -> int
2. 각각의 이름은 M과 N -> 변수명 M, N
3. 구분 기준은 공백
4. 소수 결과를 출력 -> println(result)
  -> int result 객체에 소수 결과를 출력하기
----------------------------------------
<설계>
-소수의 기준(정의)는 무엇인가? 
:
- 순서대로 출력

1. 외부에서 숫자 2개 입력받기
2. 두 숫자 사이의 범위에 존재하는 모든 수 구하기
3. 해당 범위 내의 숫자 중에서 소수의 기준을
충족하는 숫자를 결과 객체에 담기
4. 순서대로 출력
----------------------------------------
<구조>
1. import java.util.*;
   Scanner scn = new Scanner(System.in);
2. M =< 모든 수 =< N -> M, ... ,N -> 총 최대개수는 (M-N)+1개 
3. if(소수의 기준을 충족하는 것만) {
    result();
}
break;
4. System.out.println(result);
*/