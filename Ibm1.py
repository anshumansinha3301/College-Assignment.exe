def countIncreasingSubarrays(arr):
    MOD = 10**9 + 7
    n = len(arr)
    if n == 0:
        return 0
    ans = 0
    length = 1
    for i in range(1, n):
        if arr[i] > arr[i - 1]:
            length += 1
        else:
            ans = (ans + length * (length + 1) // 2) % MOD
            length = 1
    ans = (ans + length * (length + 1) // 2) % MOD
    return ans
