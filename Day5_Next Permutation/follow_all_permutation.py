def all_permissions(arr,freq,temp_ans,result):
    if len(temp_ans) == len(arr):
        result.append(temp_ans[:])
        return
    for i in range(len(arr)):
        if not freq[i]:
            freq[i] = 1
            temp_ans.append(arr[i])
            all_permissions(arr,freq,temp_ans, result)
            freq[i] = 0
            temp_ans.pop()

result = []
user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
freq = [0]*len(arr)
all_permissions(arr=arr,freq=freq,temp_ans=[],result=result)
print(result)
