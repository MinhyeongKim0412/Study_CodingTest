#%%
def solution(dots):
    x = [i[0] for i in dots]
    y = i[[1] for i in dots]
    
    row = max(x) - min(x)
    col = max(y) - min(y)
    
    size = row * col
    
    return size