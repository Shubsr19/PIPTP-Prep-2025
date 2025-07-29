Problem:
def fun(a, b):
    if (a > 0):
        return fun(a - 2, a + b) + fun(a - 3, a + b) + fun(a - 4, a + b)
    else:
        a = b
        b = a
        return (a + b)

print(fun(4, 3))
🧠 Key Observations:
The function uses recursion, calling itself 3 times in each recursive step.

When a <= 0, the recursion ends with:


a = b
b = a
return a + b  → effectively returns 2 * b
🔁 Step-by-Step Tree Expansion (Only summary):
Call: fun(4, 3)
→ expands to:


fun(2, 7) + fun(1, 7) + fun(0, 7)
Now:

fun(2, 7) →
fun(0, 9) + fun(-1, 9) + fun(-2, 9)
→ All return 2 * 9 = 18 + 18 + 18 = 54
fun(1, 7) →


fun(-1, 8) + fun(-2, 8) + fun(-3, 8)
→ All return 2 * 8 = 16 + 16 + 16 = 48
fun(0, 7) →


→ returns 2 * 7 = 14
🧮 Total Calculation:

fun(4,3) = 54 + 48 + 14 = 116
✅ Final Output:

116
