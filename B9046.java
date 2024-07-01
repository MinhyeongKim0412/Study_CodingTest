import java.util.Scanner;

public class B9046 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();

        while (T-- > 0) {
            String input = scn.nextLine();
            int[] count = new int[26];


            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if ('a' <= ch && ch <= 'z') {
                    count[ch - 'a']++;
                }
            }
            int maxCnt = -1;
            char result = '?';

            for (int i = 0; i < 26; i++) {
                if (count[i] > maxCnt) {
                    maxCnt = count[i];
                    result = (char) ('a' + i);
                } else if (count[i] == maxCnt) {
                    result = '?';
                }
            }
            System.out.println(result);
        }
    }
}
