import sys
# 구간합? 
input =sys.stdin.readline
n, x  = map(int, input().split())
visit = list(map(int, input().split()))
check =0
sum = [] 
add = 0
cnt = 0
for i in range(len(visit)):
    check += visit[i]

if check == 0:
    print("SAD")

else: 
    for i in range(x):
        add += visit[i] # 첫날이 포함된 첫 묶음
    sum.append(add)
    # cnt = 0

    for i in range(n): # 첫날이 빠지고 그담날 방문자수 업데이트 됨
        if i+x == n: break # 방문자 리스트끝났는데 더 갈 까봐
        # next = sum - visit[i] + visit[i+x]
        # 그냥 가능한구간의 합을 sum에다가 append 시켜야 됨
        next = sum[i] - visit[i] + visit[i+x]
        sum.append(next)
    # print(sum)
    maxnum = max(sum)

    for i in range(len(sum)):
        if maxnum == sum[i]:
            cnt +=1 
    print(maxnum)
    print(cnt) 