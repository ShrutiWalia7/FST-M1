
fruit = {
    "orange": 10,
    "apple": 20,
    "grape": 40,
    "kiwi": 50
}

check_fruit = input("Enter fruit required : ").lower()

if(check_fruit in fruit):
    print("fruit is available")
else:
    print("fruit not available")