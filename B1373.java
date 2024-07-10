package July.complete;

import java.util.Scanner;

public class B1373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 2진수 문자열을 입력받음
        String binaryString = scanner.next();

        // 2진수 문자열의 길이를 구함
        int length = binaryString.length();

        // 2진수 문자열이 3의 배수가 되도록 앞에 추가할 '0'의 개수를 계산
        int paddingLength = 3 - (length % 3);

        // 만약 추가할 '0'의 개수가 3이 아니라면 (즉, 2진수 문자열이 이미 3의 배수라면 '0'을 추가하지 않음)
        if (paddingLength != 3) {
            // 계산된 개수만큼 '0'을 문자열 앞에 추가
            for (int i = 0; i < paddingLength; i++) {
                binaryString = "0" + binaryString;
            }
        }

        // 8진수 문자열을 저장할 StringBuilder 객체 생성
        StringBuilder octalString = new StringBuilder();

        // 3자리씩 나눠서 8진수로 변환
        for (int i = 0; i < binaryString.length(); i += 3) {
            // 현재 3자리 2진수 문자열을 추출
            String threeDigits = binaryString.substring(i, i + 3);
            // 추출한 3자리 2진수 문자열을 10진수 정수로 변환
            int octalDigit = Integer.parseInt(threeDigits, 2);
            // 변환한 10진수 정수를 8진수 문자열에 추가
            octalString.append(octalDigit);
        }

        // 최종 변환된 8진수 문자열을 출력
        System.out.println(octalString.toString());
    }
}
