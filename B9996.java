
//B9996

//입력받는 기능 가져오기
import java.util.Scanner;

public class B9996 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int fileCnt = scn.nextInt(); // 파일 개수
        scn.nextLine();

        String pattern = scn.nextLine(); // 패턴
        String check = pattern.replace("*", ".*");

        // 반복문으로 검증 파일개수만큼
        for (int i = 0; i < fileCnt; i++) {
            String fileName = scn.nextLine();
            // "일치하면 "DA""
            if (fileName.matches(check)) {
                System.out.println("DA");
                // "일치하지 않으면 "NE""
            } else {
                System.out.println("NE");
            }
        }
    }
}
