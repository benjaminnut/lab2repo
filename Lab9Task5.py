def f(n):
    if n == 1: return 0
    if n == 2: return 0
    if n == 3: return 1
    if n == 4: return 3

    return 2 * f(n - 1) + 2 **(n-4) - f(n -4)
