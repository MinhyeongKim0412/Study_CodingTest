package July.Study;

import java.util.*;

public class B20291 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fileCnt = scn.nextInt();
        scn.nextLine(); // 개행 문자 처리

        Map<String, Integer> extCountMap = new HashMap<>();

        for (int i = 0; i < fileCnt; i++) {
            String fileName = scn.nextLine();
            String ext = getExtension(fileName);
            extCountMap.put(ext, extCountMap.getOrDefault(ext, 0) + 1);
        }
        scn.close();

        List<String> extList = new ArrayList<>(extCountMap.keySet());
        Collections.sort(extList);

        for (String ext : extList) {
            System.out.println(ext + " " + extCountMap.get(ext));
        }
    }

    private static String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        return fileName.substring(dotIndex + 1);
    }
}
/*
----------------------------------------
<문제분석>
[체감 난이도: normal]
-구해야 할 것: 확장자 별 파일 개수와 확장자의 사전 순 정렬
----------------------------------------
<설계>
1. 입력 받기
    - Scanner를 사용하여 파일 개수와 파일 이름을 입력받기
2. 확장자 추출 및 카운트
    - 파일명에서 확장자 부분만 추출 ('.' 이후의 문자열)
    - 확장자별로 개수를 카운트하여 Map에 저장
3. 확장자 정렬
    - 확장자 명들을 사전 순으로 정렬
4. 결과 출력
    - 각 확장자와 그 개수를 출력
----------------------------------------
<구조>
0. import java.util.*;
0. Scanner scn = new Scanner(System.in);
0. int fileCnt = scn.nextInt();
0. scn.nextLine();
1. Map<String, Integer> extCountMap = new HashMap<>();
2. for (int i = 0; i < fileCnt; i++) {
    String fileName = scn.nextLine();
    String ext = getExtension(fileName);
    extCountMap.put(ext, extCountMap.getOrDefault(ext, 0) + 1);
}
3. List<String> extList = new ArrayList<>(extCountMap.keySet());
4. Collections.sort(extList);
5. for (String ext : extList) {
    System.out.println(ext + " " + extCountMap.get(ext));
}
----------------------------------------
 */
