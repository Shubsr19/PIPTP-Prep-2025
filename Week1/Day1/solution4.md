Problem:

a = 3
b = 3

if (1 ^ 1):
    a = 1
else:
    b = 2

print(a + b)
🧠 Step-by-Step Evaluation:
🔸 Step 1: Bitwise XOR

1 ^ 1  →  0  (since 1 XOR 1 = 0)
🔸 Step 2: if (0) → evaluates as False
So, the else block is executed:


b = 2
🔸 Step 3: Final values
a = 3 (unchanged)

b = 2 (modified)

🔸 Step 4: Print


print(a + b) → print(3 + 2) → 5
✅ Final Output:

5
