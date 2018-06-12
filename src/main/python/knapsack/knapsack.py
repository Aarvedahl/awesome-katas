
arr = [][]
def knapsack(n, C):
    if arr[n][C] != undefined: return arr[n][C]
    if n == 0 or C == 0:
        result = 0
    else if w[n] > C:
        result = knapsack(n-1, C)
    else:
        tmp1 = knapsack(n-1, C)
        tmp2 = v[n] + knapsack(n-1, C - w[n])
        result = max{tmp1, tmp2}
    arr[n][C] = result
    return result


knapsack(4, 10)
