import sys
input = sys.stdin.readline

n, m = map(int, input().split())
board = [list(input().strip()) for _ in range(n)]

rotate = {
    '.': '.',
    'O': 'O',
    '-': '|',
    '|': '-',
    '/': '\\',
    '\\': '/',
    '^': '<',
    '<': 'v',
    'v': '>',
    '>': '^'
}

result = [[''] * n for _ in range(m)]

for i in range(n):
    for j in range(m):
        result[m - 1 - j][i] = rotate[board[i][j]]

for row in result:
    print(''.join(row))