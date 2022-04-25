
""" else statement : when i add if condition against else statement print should be in same line
when i remove condition against the else statement - print statement need tab  """

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


