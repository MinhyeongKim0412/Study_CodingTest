import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());	// 재료의 개수
        int M = Integer.parseInt(br.readLine());	// 갑옷이 완성되는 번호의 합

        // 재료들의 고유번호를 입력받아 배열 A[N]에 저장한다.
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // A[N]을 오름차순 정렬한다.
        Arrays.sort(A);

        int count = 0;	// 갑옷을 만들 수 있는 경우의 수
        int i = 0;		// min 값이 저장된 인덱스
        int j = N-1; 	// max 값이 저장된 인덱스

        // 투 포인터 이동 원칙을 이용해 탐색
        while(i < j) {
            if(A[i]+A[j] < M) {
                i++;
            } else if (A[i]+A[j] > M) {
                j--;
            } else { // A[i]+A[j] == M
                count++;
                i++;
                j--;
            }
        }

        // 결과 출력
        System.out.println(count);
        br.close();
    }
}