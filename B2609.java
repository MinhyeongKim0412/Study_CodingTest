package July.Study;

import java.util.Scanner;

public class B2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 수 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // 최대공약수 구하기
        int gcd = gcd(a, b);

        // 최소공배수 구하기
        int lcm = a * b / gcd;

        // 결과 출력
        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 유클리드 호제법을 이용한 최대공약수 계산
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
