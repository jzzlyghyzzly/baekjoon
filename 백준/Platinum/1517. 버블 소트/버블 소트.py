import sys
input = sys.stdin.readline
result = 0

N = int(input().strip())
A = list(map(int, input().split()))
A.insert(0, 0)          # 1-indexed
tmp = [0] * (N + 1)

def merge_sort(s, e):
    global result
    if e - s < 1:
        return
    m = s + (e - s) // 2

    # 분할
    merge_sort(s, m)
    merge_sort(m + 1, e)

    # 병합 준비: 현재 구간 복사
    for i in range(s, e + 1):
        tmp[i] = A[i]

    # 병합
    k = s
    index1 = s
    index2 = m + 1

    while index1 <= m and index2 <= e:
        if tmp[index1] > tmp[index2]:
            A[k] = tmp[index2]
            # 역전쌍(=swap) 증가: 왼쪽에 남은 개수만큼
            result += (m - index1 + 1) # 이해안됨 ㅅㅂ
            # index2 - k도 올바른 불변식이면 동치지만, 실수 위험이 있어 (m -index + 1)이 더 안전하다고 함
            k += 1
            index2 += 1
        else:
            A[k] = tmp[index1]
            k += 1
            index1 += 1

    # 위의 루프를 빠져나오면 둘 중 하나는 소진됨 → 꼬리 복사
    while index1 <= m:
        A[k] = tmp[index1]
        k += 1
        index1 += 1

    while index2 <= e:
        A[k] = tmp[index2]
        k += 1
        index2 += 1

merge_sort(1, N)
print(result)
