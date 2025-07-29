🧾 Problem:
def fun(a, b):
    if (a and b and (a + b) > 0):
        return a + fun(a - 2, b - 2) + b
    return a ^ b  # Bitwise XOR

res = fun(8, 8)
print(res)
🧠 Step-by-Step Execution:
We evaluate: fun(8, 8)

Let's break the recursive calls:
fun(8, 8)

a = 8, b = 8 → a + b = 16 > 0

So:
return 8 + fun(6, 6) + 8

fun(6, 6)

return 6 + fun(4, 4) + 6

fun(4, 4)

return 4 + fun(2, 2) + 4

fun(2, 2)

return 2 + fun(0, 0) + 2

fun(0, 0)

Now: a = 0, b = 0

Condition fails → go to return a ^ b = 0 ^ 0 = 0

Now compute step-by-step:

fun(0,0) = 0

fun(2,2) = 2 + 0 + 2 = 4

fun(4,4) = 4 + 4 + 4 = 12

fun(6,6) = 6 + 12 + 6 = 24

fun(8,8) = 8 + 24 + 8 = 40

✅ Final Output:

40
