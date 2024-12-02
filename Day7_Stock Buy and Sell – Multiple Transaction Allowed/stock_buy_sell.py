# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615
def maximumProfit(prices):
    # code here
    profit = 0
    for i in range(1,len(prices)):
        if prices[i] > prices[i-1]:
            profit += (prices[i]-prices[i-1])
    return profit

user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(maximumProfit(arr=arr))
