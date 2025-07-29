Python Code:

def fun(w, x):
    y = 0
    if ((x % w == 0) or (w % x) == 0):
        y = y + 1
    else:
        y = y + 10
    print(y)

print(fun(40, 4))
🧠 Step-by-Step Explanation:
Function call: fun(40, 4)

w = 40, x = 4

Evaluate condition:


if ((x % w == 0) or (w % x == 0))
→ if ((4 % 40 == 0) or (40 % 4 == 0))
→ if (False or True) → True
Since the condition is True, we do:


y = y + 1  → y = 1
print(y)   → prints 1
The function does not return anything, so it returns None.

✅ Final Output:
1
None
