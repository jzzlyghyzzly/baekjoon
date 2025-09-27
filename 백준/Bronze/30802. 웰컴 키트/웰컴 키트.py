import sys

input = sys.stdin.readline

N = int(input().strip())
size= list(map(int, input().split()))
T, P = map(int,input().split())
result = 0

for t in size:
    if t == 0:
        continue
    if t % T == 0:
        result += t//T
    elif t % T != 0:
        result += t//T + 1
print(result)
print(f"{N//P} {N%P}")
