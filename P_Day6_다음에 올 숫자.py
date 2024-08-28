#%%
def solution(arr):
    if arr[1] - arr[0] == arr[2] - arr[1]:
        d = arr[1] - arr[0] # d=diffence (등차)
        result = arr[-1] + d
    else:
        r = arr[1] // arr[0] # r=ratio (등비)
        result = arr[-1] * r
    return result

# 2번째 숫자 - 1번째 숫자 = 3번째 숫자 - 2번째 숫자
# y -> 등차수열 ---> 마지막 숫자 + 등차간격
# n -> 등비수열 ---> 마지막 숫자 * 등비간격