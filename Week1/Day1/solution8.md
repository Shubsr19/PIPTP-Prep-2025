Problem:
a = 2
b = 4
c = 2

if (b - a):       # 4 - 2 = 2 → True
    b = a ^ b     # XOR: 2 ^ 4 = 6 → b = 6
    a = c         # a = 2
    if (b):       # b = 6 → True
        a = a ^ b # 2 ^ 6 = 4 → a = 4
        b = b - 1 # b = 6 - 1 = 5

if (c):           # c = 2 → True
    a = b         # a = 5

print(a + b + c)  # 5 + 5 + 2 = 12
🧠 Final Variable Values:
a = 5

b = 5

c = 2

✅ Final Output:

12
