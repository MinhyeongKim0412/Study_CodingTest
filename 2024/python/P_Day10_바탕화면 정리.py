# # https://school.programmers.co.kr/learn/courses/30/lessons/161990?language=python3

# pass 

# # 변수명
# 배열 wallpaper (문제에서 주어진 이름)
# 시작점 S (lux,luy) --- 끝점 E (rdx,rdy)
# 거리 d = |rdx - lux| + |rdy - luy|

# # 문제이해
# 엑셀과 같은 구성 좌상단이 (0,0)
# 칸의 값 - 파일O: #, 파일X: .
# 최소한의 이동거리를 구하기

# # 코드써보기
# 거리 구하는 식 = |rdx - lux| + |rdy - luy|
# 결과값 형식 = []

# # 접근

# 1. "" 안에 들어있는 글자의 수를 세기 -> 열(세로)개수 col 으로 변수명 정의
# 2. 각 칸에 위치 배정해주기 ---> 
# for i in range(wallpaper):
#         return (i.append,col)
# 3. 시작점과 끝점은 파일이 들어있는 칸을 기준으로 보아야한다.
# 파일이 들어있는 칸의 (,) 함수 중, x값과 y값의 최소 최대를 찾고 (x최솟값, y최대값)의 결과로 출력되어야 최소한의 이동거리가 됨.