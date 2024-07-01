import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String arrays = scn.next();
        int result =0;

        for(int i=0 ; i< n; i++) {
            result += Character.getNumericValue(arrays.charAt(i));
        }
        System.out.println(result);
    }
}
