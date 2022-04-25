
from tkinter.messagebox import YES
from unittest.result import failfast


username1 = input("Enter first user name: ")
username2 = input("Enter second user name: ")

user1_answer = input(username1+ " Select any value ").lower()
user2_answer = input(username2+ " Select any value ").lower()

if user1_answer == user2_answer:
  print("Both user select same value: tie ")

elif user1_answer == "rock":
     if user2_answer == "scissors":
      print(username1+ " "+"win")
     else:
       print(username2+ "win")

elif user1_answer == "scissors":
     if user2_answer == "paper":
       print(username2 + "win")
     else: 
       print(username2+ "win")

elif user1_answer == "paper":
     if user2_answer == "rock":
       print(username2 + "win")
     else:
        print(username2+ "win")

else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

# Ask again if user wants to play next rount:

answer = input("User want to pay again- yes/no").lower()
if (answer == "yes"):
    pass

elif(answer == "no"):
        raise SystemExit
else:
    print("You entered an invalid option. Exiting now.")
    raise SystemExit




