import sys
input =sys.stdin.readline
c,b = map(int, input().split())
result = c/b
if c%b == 0:
    print(c//b)
else:
    print(f"{result:.10f}")