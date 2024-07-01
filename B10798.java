import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] grid = new char[5][15];

        for(int i=0; i<5; i++) {
            String line = scn.nextLine();
            for(int j=0; j<line.length(); j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        StringBuilder result = new StringBuilder();
        for(int j=0; j<15; j++) {
            for(int i=0; i<5; i++) {
                if (grid[i][j] !='\0') {
                    result.append(grid[i][j]);
                }
            }
        }
        System.out.println(result.toString());
    }
}
