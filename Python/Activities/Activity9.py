listOne = [10,20,30,45,55]
listSecond = [45,65,70,19,80]

thirdList = []

for list in listOne:
    if(list%2 != 0):
        thirdList.append(list)

for list in listSecond:
    if(list%2 == 0):
        thirdList.append(list)

print(thirdList)