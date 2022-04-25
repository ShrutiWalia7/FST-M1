
def calculateSum(num):
    if num:
        num + calculateSum(num - 1)
        return num
    else:
        return 0

result = calculateSum(10)
print(result)

