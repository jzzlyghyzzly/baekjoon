import sys

n = int(sys.stdin.readline().strip())

layer = 1
end = 1

while n > end:
    end += 6 * layer
    layer += 1

print(layer)
