# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

def nextPermutation(arr):
    # code here
    break_point = -1 # 1.check where the decremental ordering is breaking
    for i in range(len(arr) - 2, -1, -1):
        if arr[i] < arr[i + 1]:
            break_point = i
            break
    if break_point == -1: # it is the last permutation
        arr.reverse()
        return arr

    for i in range(len(arr) - 1, break_point, -1): # 2.swap break point with the next greater number
        if arr[i] > arr[break_point]:
            arr[break_point], arr[i] = arr[i], arr[break_point]
            break
    arr[break_point + 1 :] = reversed(arr[break_point + 1 :]) # 3.reverse the element from break point to end
    return arr

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(nextPermutation(arr=arr))
