
//B1157
import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // "대소문자로 된 단어가 주어지면"(소문자 변환)
        String str = scn.next().toLowerCase();

        // "알파벳"(총 26개 글자)
        int[] cnt = new int[26];

        // 전체 알파벳 반복 횟수를 하나씩 확인
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            cnt[ch - 'a']++;
        }

        int maxCnt = 0;
        char maxChar = '?';

        // 최대 등장횟수 글자 구하기
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxCnt) {
                // "가장 많이 사용된 알파벳을"
                maxCnt = cnt[i];
                // "대문자로 출력한다."
                maxChar = (char) (i + 'A');
                // "여러 개 존재(중복)하는 경우에는"
            } else if (cnt[i] == maxCnt) {
                // "?를"
                maxChar = '?';
            }
        }
        // "출력한다."
        System.out.println(maxChar);
    }
}
