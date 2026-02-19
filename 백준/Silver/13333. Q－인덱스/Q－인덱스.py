import sys
input = sys.stdin.readline
n = int(input().strip())
c = list(map(int, input().split()))
# 내림차순 정렬, 상위 k편 / 나머지 편을 '인덱스'로 나누기 위해
c.sort(reverse=True)
# k를 큰 값부터 내려가며 첫 성립값이 답(최댓값)
for k in range(n, -1, -1):
    if k == 0:
        print(0)
        break
    # 상위 k 편이 k 이상인지: 정렬 이후에 k번째만 보면 됨
    if c[k-1] < k :
        continue
    # 나머지가 모두 k이하ㅏ인지: k+1번째만 보면됨
    if k <n and c[k] > k:
        continue
    print(k)
    break