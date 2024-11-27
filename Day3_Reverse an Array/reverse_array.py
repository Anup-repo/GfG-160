# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
def reverseArray(arr):
    # code here
    i = 0
    j = len(arr)-1
    while i<=j:
        arr[i],arr[j] = arr[j],arr[i]
        i += 1
        j -= 1
    return arr

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(reverseArray(arr=arr))