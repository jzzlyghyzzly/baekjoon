from collections import deque

A, B, C = map(int, input().split())
S = A + B + C

# 총합이 3으로 나누어떨어지지 않으면 불가능
if S % 3 != 0:
    print(0)
    exit()

visited = set()
queue = deque()

# 항상 정렬된 상태로 저장
start = tuple(sorted((A, B, C)))
queue.append(start)
visited.add(start)

while queue:
    a, b, c = queue.popleft()
    if a == b == c:
        print(1)
        exit()

    for x, y in ((a, b), (a, c), (b, c)):
        if x == y:
            continue
        if x < y:
            nx, ny = x + x, y - x
        else:
            nx, ny = x - y, y + y

        nz = S - nx - ny
        nxt = tuple(sorted((nx, ny, nz)))

        if nxt not in visited:
            visited.add(nxt)
            queue.append(nxt)

print(0)
