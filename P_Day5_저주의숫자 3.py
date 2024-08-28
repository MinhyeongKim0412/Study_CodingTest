#%%
def solution(n):
    arr = list(range(1,201))
    new_arr = []
    
    for i in arr:
        if i%3 == 0:
            continue
        if '3' in str(i):
            continue
        new_arr.append(i)
        
    new_n = new_arr[n-1]
    return new_n

#
1.
1부터 100까지 존재하는 숫자의 배열 생성
이 중
3의 배수 (3 포함)인 원소 삭제하고
3이라는 숫자가 원소 안에 포함되어있는 원소도 삭제

2.
위의 두 조건을 충족하여 남은 숫자들을 새로운 배열에 담음

3.
주어진 n을 새로운 배열의 n번째 숫자로 가져옴
