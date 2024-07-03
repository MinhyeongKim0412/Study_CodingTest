package July.Study;

import java.util.Scanner; // 스캐너 기능 주입

public class B17413 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 스캐너 기능 사용 선언(외부에서 입력되는 값 받아오기 위해)
        String input = scn.nextLine(); // 입력받은 문자열 S를 input객체로 새롭게 저장
        StringBuilder rev = new StringBuilder(); // 거꾸로 만들 S를 저장할 rev객체 설정
        StringBuilder result = new StringBuilder(); // 거꾸로 만드는 처리(rev) 후 바뀐 결과를 저장할 result객체 설정
        boolean tag = false; // 어떤 특정 글자가 태그 안에 있는지 여부 판단하는 참거짓 태그 설정(안:true, 밖:false)

        // 반복문 사용 (문자열 S 안의 모든 글자들을 하나하나 반복해야하므로)
        for (int i = 0; i < input.length(); i++) { // 입력한 S 길이까지만 반복
            char s = input.charAt(i); // 현재 문자
            if (s == '<') { // 태그 열기
                if (input.length() > 0) { // 거꾸로 저장할 s 길이가 0보다 크다면
                    result.append(rev.reverse()); // 거꾸로 처리
                    rev.setLength(0); // 저장할 rev 객체 비우기(초기화)
                }
                tag = true; // 태그 안에 넣음(true)
                result.append(s); // 결과물에 < 추가
            } else if (s == '>') { // 태그 닫기
                tag = false; // 태그 밖으로 뺌(false)
                result.append(s); // 결과물에 >를 추가
            } else {
                if (tag) { // 태그 안이라면
                    result.append(s); // 그대로 결과에 추가
                } else {
                    if (s == ' ') { // 단어가 끝났다면
                        result.append(rev.reverse()); // 거꾸로 처리
                        result.append(s); // 공백 추가
                        rev.setLength(0); // rev 객체 비우기(초기화)
                    } else {
                        rev.append(s); // 단어에 문자 추가
                    }
                }
            }
        }
        if (rev.length() > 0) { // 마지막 단어 처리
            result.append(rev.reverse());
        }
        System.out.println(result); // 결과 출력
    }
}