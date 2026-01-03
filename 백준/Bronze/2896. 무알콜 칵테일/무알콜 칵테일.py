import sys
input =sys.stdin.readline
a,b,c = map(int, input().split())
l,j,k = map(int, input().split())

t = min(a/l , b/j, c/k)
orange = a-t*l
apple =b-t*j
pine = c-t*k
juice =[]
juice.append(orange)
juice.append(apple)
juice.append(pine)
print(*juice)