import sys
input = sys.stdin.readline

case_number = int(input().strip())


for _ in range(case_number):
    line = input().strip()
    char = list(line)
    
    streak = 0
    size = 0
    
    for ch in char:
        if ch == 'O':
            streak += 1
            size += streak # 1다음은 2를 더해야하니까 
        else:
            streak = 0
    print(size)
            