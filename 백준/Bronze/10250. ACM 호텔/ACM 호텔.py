import sys
input = sys.stdin.readline

howmany = int(input().strip())

for _ in range(howmany):
    H, W, N = map(int, input().split())

    floor = N % H
    room = N // H + 1

    if floor == 0:   # H의 배수인 경우
        floor = H
        room = N // H

    print(floor * 100 + room)
