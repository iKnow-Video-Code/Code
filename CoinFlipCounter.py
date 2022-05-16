from random import randint


c = 0
n = 0

while n <= 9:
  output = randint(0, 1)
  if output == 0:
    c += 1
  n += 1

print("You have $" + str(c) + "!")