# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote
def findMajority(arr):
    # Your Code goes here.
    count_1, count_2 = 0,0
    candidate_1, candidate_2 = 0,0
    for num in arr: # morries voting algorithm
        if count_1 == 0 and num != candidate_2:
            candidate_1,count_1 = num, 1
        elif count_2 == 0 and num != candidate_1:
            candidate_2,count_2 = num, 1
        elif num == candidate_1:
            count_1 += 1
        elif num == candidate_2:
            count_2 += 1
        else:
            count_1 -= 1
            count_2 -= 1

    result = []
    threshold = len(arr) // 3

    count_1 = count_2 = 0
    for num in arr:
        if candidate_1 == num:
            count_1 += 1
        elif candidate_2 == num:
            count_2 += 1

    if count_1 > threshold and count_2 > threshold:
        return [min(candidate_1, candidate_2), max(candidate_1, candidate_2)]
    elif count_1 > threshold:
        return [candidate_1]
    elif count_2 > threshold:
        return [candidate_2]
    else:
        return []

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(findMajority(arr=arr))
