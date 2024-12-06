# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2
def maximumProfit(prices):
    # code here
    buy = prices[0]
    profit = 0
    for i in range(1,len(prices)):
        if prices[i] < buy:
            buy = prices[i]
        elif prices[i] - buy > profit:
            profit = prices[i] - buy
    return profit


user_input = input("Enter space-separated integers: ")
arr = list(map(int, user_input.split()))
print(maximumProfit(arr=arr))
