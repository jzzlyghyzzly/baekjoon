import sys
input =sys.stdin.readline
num = list(input().strip())
sorted_num = ''.join(sorted(num,reverse=True))
print(sorted_num)