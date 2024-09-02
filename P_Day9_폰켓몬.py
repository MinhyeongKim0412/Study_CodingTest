# https://school.programmers.co.kr/learn/courses/30/lessons/1845
#%%
def solution(nums):
    return min(len(list(set(nums)), len(nums)//2))


# # 구조설계
# 1. nums 배열(매개변수)을 받아오는 solution 함수를 정의해줌
# 2. 중복원소 제거 후 종류 counting을 위해
# 2-1) 자료형을 set으로 새로 담아줌
# 2-2) 새로운 배열의 길이 세기 (len 활용)
# 3. 제한사항(최대 n/2마리 골라갈 수 있음) 반영하기. 결과출력값이 해당 최댓값보다 크다면 최대값으로 대체.(min 활용)
# 4. return
