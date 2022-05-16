from random import randint
number = randint(1, 10)
check = True 
n1 = 0
while check:
  n = int(input("Type a number from 1 - 10!!!  "))

  if n != number: 
    print("You are " + str((number - n)) + " away.")

  if n == number:
    check = False 

  n1 += 1

print ("Congratulations! You got your answer in " + str(n1) + " tries!")