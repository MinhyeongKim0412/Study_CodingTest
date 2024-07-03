package July.Study;

import java.util.Scanner;

public class B3613 {
    public static void main(String[] args) {
        // 1. 스캐너 기능 주입
        Scanner scanner = new Scanner(System.in);

        // 2. 새로운 스캐너 기능 사용을 선언
        // 3. 담아올 문자열 객체담기(String S)
        String S = scanner.nextLine();
        scanner.close();

        // 5-1. 주어진 S의 언어 형식을 알아내기 - <조건문 if>
        if (isValidJava(S)) {
            // Java 스타일 -> C++ 스타일로 변환
            System.out.println(convertToCpp(S));
        } else if (isValidCpp(S)) {
            // C++ 스타일 -> Java 스타일로 변환
            System.out.println(convertToJava(S));
        } else {
            // 유효하지 않은 경우
            System.out.println("Error!");
        }
    }

    // 4. 문자열 속 임의의 하나의 글자 객체담기(String s)
    private static boolean isValidJava(String S) {
        if (S.isEmpty() || !Character.isLowerCase(S.charAt(0))) {
            return false;
        }
        for (int i = 0; i < S.length(); i++) {
            String s = String.valueOf(S.charAt(i));
            if (s.equals("_") || Character.isUpperCase(S.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidCpp(String S) {
        if (S.isEmpty() || S.charAt(0) == '_' || S.charAt(S.length() - 1) == '_') {
            return false;
        }
        boolean prevUnderscore = false;
        for (int i = 0; i < S.length(); i++) {
            String s = String.valueOf(S.charAt(i));
            if (Character.isUpperCase(S.charAt(i))) {
                return false;
            }
            if (s.equals("_")) {
                if (prevUnderscore) {
                    return false;
                }
                prevUnderscore = true;
            } else {
                prevUnderscore = false;
            }
        }
        return true;
    }

    private static String convertToCpp(String S) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            String s = String.valueOf(S.charAt(i));
            if (Character.isUpperCase(S.charAt(i))) {
                result.append('_').append(Character.toLowerCase(S.charAt(i)));
            } else {
                result.append(s);
            }
        }
        return result.toString();
    }

    private static String convertToJava(String S) {
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;
        for (int i = 0; i < S.length(); i++) {
            String s = String.valueOf(S.charAt(i));
            if (s.equals("_")) {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(S.charAt(i)));
                    toUpperCase = false;
                } else {
                    result.append(s);
                }
            }
        }
        return result.toString();
    }
}

// ------------------------------------------------------------
// - [[[[[[[[[[[[[[[[[[[ 문제 분석
// c++ -> java 일때
// 1. 모든 단어는 붙여씀 / replace "_" -> ""  
// 2. 다음 단어의 첫문자만 대문자 / toUpperCase (기존 c++기준으로 _ 바로 뒷 글자)

// java -> c++ 일때
// 1. 소문자만 사용 / toUowerCase
// 2. 단어의 구분 기호는 _ / add "_" (기존 java 기준으로, 대문자였던 s 바로 앞 글자)
// ------------------------------------------------------------
// - [[[[[[[[[[[[[[[[[[[ 변수명 설정
// 입력된 코드 문자열 -> S (String)
// 해당 문자열을 구성하고 있는 하나의 글자 -> s (String)
// 치환한 결과값을 담을 최종적인 객체 -> result (String)
// ------------------------------------------------------------
// -  [[[[[[[[[[[[[[[[[[[ 설계 순서
// 1. 스캐너 기능 주입
// 2. 새로운 스캐너 기능 사용을 선언

// 3. 담아올 문자열 객체담기(String S)
// 4. 문자열 속 임의의 하나의 글자 객체담기(String s)

// 5-1. 주어진 S의 언어 형식을 알아내기 - <조건문 if>
// 5-2. s를 하나씩 모두 확인해서 특정 문자에 해당하는지 확인 - <반복문 for>(변수 int i 사용, i++로 설정)

// - 만약 모든 s 중에 대문자가 하나도 없다면 -> C++
// -- 만약 어떤 s 중 _ 기호가 있다면 -> replace ""
// -- 해당 s의 바로 뒷글자 1개만 -> toUpperCase

// - 그외에는 -> Java
// -- 만약 어떤 s 중 대문자가 있다면 -> 해당 s를 toLowerCase
// -- 해당 s의 바로 앞글자와 s사이에 -> _ 기호 추가.
// ----------------------------------------------------------------------
// - [[[[[[[[[[[[[[[[[[[ 대략적인 코드 구조 (모르는 부분은 "###"으로 우선 표기)
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {     
//     }
// }

// Scanner scn = new Scanner(System.in);
// String S = scn.nextLine();
// String s = ###;
// String result = ###;

// for(int i=0; i<S.length(); i++) {
//     if(### S 안에 대문자가 없다면) {
//         result.append(c);
//     }else{
    // if(###){
    //     if(s == '_'){
    //         result.replce("");
    //         result.t뒷글자 toUpperCase\();
    //     }
    // }else{
    //     if(### s가 대문자라면) {
    //         result.toLowerCase();
    //         result.t 앞글자 add(_);//이어붙이기
    //     }
    // }
//     }
// }



// System.out.println(result);
// ------------------------------------------------------------