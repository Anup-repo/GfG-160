# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604

def maxProduct(arr):
    # code here
    prefix, suffix = 1,1
    maxi = float("-inf")
    n = len(arr)
    for i in range(n): # check prefix max and suffix max 
        if prefix == 0:
            prefix = 1
        if suffix == 0:
            suffix = 1
        prefix *= arr[i]
        suffix *= arr[n-i-1]
        maxi = max(maxi,prefix,suffix)
    return maxi

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(maxProduct(arr=arr))
