import sys

input = sys.stdin.readline

N = int(input().strip())
A = list(map(int, input().split()))
 
A.sort() # A 정렬 끝
M = int(input().strip())
target = list(map(int, input().split()))
for i in range(M): # 타겟 수들 A에 해당하는 지 찾는 이진탐색 알고리즘
    find = False
    t = target[i]
    start = 0
    end = len(A) -1
    while start <= end:
         midi = int((start+end)/2)
         midv = A[midi]
         if midv > t: # 타겟수가 중간인덱스값보다 작으면
             end = midi -1 
         elif midv < t:
             start = midi +1
         else: # 둘 다 아니면 같은 거기 때문에
             find = True
             break # 찾았다
    if find: # find 자체가 True임
        print("1")
    else:
        print("0")      