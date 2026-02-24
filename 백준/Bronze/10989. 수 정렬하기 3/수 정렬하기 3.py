import sys
input= sys.stdin.readline
n = int(input().strip())
cnt = [0]*10001
for _ in range(n):
    num = int(input().strip())
    cnt[num] += 1
    
for i in range(10001):
    if cnt[i] != 0:
        for j in range(cnt[i]): # count[i]의 개수 만큼 i를 출력해야됨(중복 고려)
            print(i)
        