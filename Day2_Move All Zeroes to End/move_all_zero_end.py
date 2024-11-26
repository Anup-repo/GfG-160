# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
def pushZerosToEnd(arr):
    # code here
    first_zero = -1
    n = len(arr)
    for i in range(n):
        if arr[i] == 0:
            first_zero = i
            break
        
    if first_zero == -1: return arr
    
    i = first_zero
    for j in range(first_zero+1,n):
        if arr[j]!=0:
            arr[j],arr[i] = arr[i],arr[j]
            i += 1
    return arr

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(pushZerosToEnd(arr=arr))