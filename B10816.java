import java.util.Arrays;
import java.util.Scanner;

public class B10816 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);

        int M = scn.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int key = scn.nextInt();

            builder.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
        }

        System.out.println(builder);
        scn.close();
    }

    public static int lowerBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (key <= arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (key < arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

/*
 * <문제분석>
 * -숫자는 정수 int
 * -카드의 개수 총 n개
 * -주어진 정수는 m
 * 
 * -가진 n개의 카드 중에 m이라는 수가 적힌 카드는 몇 개?
 * <알고리즘 개념 정리>
 * -이분 탐색 사용
 * *이분 탐색이란?
 * : 중간값과 key값을 비교하여 구간을 줄여나가는 과정
 * -중복원소의 개수 출력하기
 * -중복원소의 길이 구하기 (상한값-하한값)
 * -upper_bound와 lower_bound 사용
 * 
 * <구조설계>
 * -m입력받기
 * -
 * <코드>
 */