def g(n):
    
    if n == 0: return 0
    
    if n == 1: return 0

    if n == 2: return 1

    return g(n - 1) + g(n - 2) + g(n - 3) + 2 ^ (n - 2)
                                                   

