# https://school.programmers.co.kr/learn/courses/30/lessons/136798?language=python3
#%%
def solution(number,limit,power):
    arr_power = []
    for i in range(1, number+1):
        count = 0
        for j in range(1, int(i**0.5)+1):
            if i%j == 0:
                count += 1
                if j != i//j:
                    count += 1
        if count > limit:
            arr_power.append(power)
        else:
            arr_power.append(count)
    kg = sum(arr_power)
    return kg


# # ------- 변수정의
# number: 사람 수
# n: 단원의 지정번호
# count: 약수의 개수 
# limit: count의 제한 수치
# kg: 공격력 = 최종적으로 필요한 철 무게 총량 (*limit 반영 후 내용)

# # ------- 구조설계
# 함수:
#     1. 1부터 n까지의 약수 개수(count) 구하기 공식을 if로 계산하고, 배열에 담기.
#     2. if count > limit, return limit / else: return count 더하고 arr_power에 담기
#     3. 3번의 내용(배열 안의 요소들) 다 더하기 (range arr_power)
#     4. return answer