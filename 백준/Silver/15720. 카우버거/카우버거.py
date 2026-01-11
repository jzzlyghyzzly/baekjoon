import sys
input = sys.stdin.readline

burger_count, side_count, drink_count = map(int, input().split())

burger_prices = list(map(int, input().split()))
side_prices = list(map(int, input().split()))
drink_prices = list(map(int, input().split()))

total_price_before_discount = (
    sum(burger_prices) + sum(side_prices) + sum(drink_prices)
)

set_count = min(burger_count, side_count, drink_count)

burger_prices.sort(reverse=True)
side_prices.sort(reverse=True)
drink_prices.sort(reverse=True)

total_price_after_discount = 0

for i in range(set_count):
    total_price_after_discount += (
        burger_prices[i] + side_prices[i] + drink_prices[i]
    ) * 9 // 10

total_price_after_discount += sum(burger_prices[set_count:])
total_price_after_discount += sum(side_prices[set_count:])
total_price_after_discount += sum(drink_prices[set_count:])

print(total_price_before_discount)
print(total_price_after_discount)
