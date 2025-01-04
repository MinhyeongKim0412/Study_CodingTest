#%%
def solution(p,c,m):
    t = p*(c*(c+1)//2)
    if t>m:
        return t-m
    else: return 0

#
# 이용료
# - 원래: p
# - 바뀐: n*p
# - c번 탔을 때: c*p
# - c번 탔을 떄'까지'의 누적: {p + 1*p + 2*p + ... + (c-1)*p + c*p} 원 ===> total

# 내가 가진 금액 / m
# 남은 금액 / (m - total)
# 부족한 금액 / c*p - (m-total)

# 조건문 분기
# if c*p > m-total: 
#     result = c*p - (m-total)
#     return result
# else: return 0