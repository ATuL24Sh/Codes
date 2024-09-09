#Task is to identify if the input number is palindrome or not .
def palnum(x):
    y=str(x)
    if y == y[::-1]:
        return True
    else:
        return False

num=input("Enter numerical input : ")
print(f"Is {num} a Palindrome ? : {palnum(num)}")
