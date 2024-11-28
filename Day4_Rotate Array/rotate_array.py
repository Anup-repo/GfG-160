# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621
def reverseArr(arr,i,j):
    while i <= j:
        arr[i],arr[j] = arr[j],arr[i]
        i+=1
        j-=1
    
def rotateArr(arr, d):
    #Your code here
    n = len(arr)
    d = d%n
    reverseArr(arr,0,d-1)
    reverseArr(arr,d,n-1)
    reverseArr(arr,0,n-1)
    return arr

user_d = int(input("Enter the value of d: "))
user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(rotateArr(arr=arr,d=user_d))
