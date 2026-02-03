import sys
input = sys.stdin.readline
fir = input().strip()
sec = list(input().strip())
cnt = 0
for c in fir:
    found =False
    for i in range(len(sec)):
        if sec[i] == c:
            sec[i] = None
            found = True
            break
    if not found:
        cnt +=1 
for x in sec:
    if x != None:
        cnt += 1
        
print(cnt)