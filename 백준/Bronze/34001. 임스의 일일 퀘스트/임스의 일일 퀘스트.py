import sys
input= sys.stdin.readline
L = int(input().strip())
MON = 500
DEC = 200

arcane_info = [
    (200, 210, 220),
    (210, 220, 225),
    (220, 225, 230),
    (225, 230, 235),
    (230, 235, 245),
    (235, 245, 250),
]
grandis_info = [
    (260, 265, 270),
    (265, 270, 275),
    (270, 275, 280),
    (275, 280, 285),
    (280, 285, 290),
    (285, 290, 295),
    (290, 295, 300),
]

def count(info, L):
    result = []
    for q, r1, r2  in info:
        if L < q:
            result.append(0)
        else:
            decrease = 0
            if r1 <= L:
                decrease += 1
            if r2 <= L:
                decrease += 1
            result.append(MON-DEC*decrease)
    return result
arcane = count(arcane_info, L)
grandis = count(grandis_info, L)
print(*arcane)
print(*grandis)
                