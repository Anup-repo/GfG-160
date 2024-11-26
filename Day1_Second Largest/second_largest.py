# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
def getSecondLargest(arr):
    # Code Here
    second_large = -1
    large = arr[0]
    for i in arr:
        if i > large:
            second_large = large
            large = i
        elif i < large and i > second_large:
            second_large = i
    return second_large


user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(getSecondLargest(arr=arr))
