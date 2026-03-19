import sys
input = sys.stdin.readline
n,m = map(int, input().split())
aart = []
val =0
for _ in range(n):
    # aart.append(list(map(int,input().split())))
    line = list(map(int,input().split()))
    for i in range(1,m+1): # 3m 개 까지 있음 index 값은 (0~ 3*m-1임)
        val = line[3*i-3]*2126 + line[3*i-2]*7152 + line[3*i-1]*722
        if 0 <= val < 510000:
            aart.append("#")
        elif 510000 <= val < 1020000:
            aart.append("o")
        elif 1020000 <= val < 1530000:
            aart.append("+")
        elif 1530000 <= val < 2040000:
            aart.append("-")
        elif 2040000 <= val :
            aart.append(".")
    aart.append("\n")
print("".join(aart), end="")