# link: https://school.programmers.co.kr/learn/courses/30/lessons/120956

# 정규표현식, re 사용, 반복문+조건문 구성
import re

def solution(babbling):
    answer = 0
    valid_pattern = re.compile(r"^(aya|ye|woo|ma)+$")  # 유효한 발음만 허용하는 정규식

    for word in babbling:
        if valid_pattern.match(word):  # 유효한 패턴과 매칭되는지 검사
            answer += 1

    return answer