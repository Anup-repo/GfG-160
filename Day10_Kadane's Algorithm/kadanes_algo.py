# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620
def maxSubArraySum(arr):
    ##Your code here
    maxi = float("-inf")
    total = 0
    for i in arr:
        total += i
        if total > maxi:
            maxi = total
        if total < 0:
            total = 0
    return maxi

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(maxSubArraySum(arr=arr))
