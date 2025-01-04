#%%
def solution(quiz):
    result = []
    for q in quiz:
        left, right = q.split('=')
        if eval(left) == int(right):
            result.append("O")
        else:
            result.append("X")
    return result