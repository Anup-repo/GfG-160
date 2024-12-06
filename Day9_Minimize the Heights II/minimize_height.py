# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351
def getMinDiff(arr,k):
    # code here
    n = len(arr)
    arr.sort()
    small = arr[0]+k
    large = arr[n-1]-k
    result = arr[n-1]-arr[0]
    
    for i in range(n-1):
        mini = min(small,arr[i+1]-k)
        maxi = max(large, arr[i]+k)
        if mini < 0:
            continue
        result = min(result,maxi-mini)
    return result

user_k = int(input("Enter the value of k: "))
user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(getMinDiff(arr=arr,k=user_k))
