number_first = float(input("Enter First Number: "))
number_second = float(input("Enter Second Number: "))
operation = input("Enter Operation (+, -, *, /): ")

if operation == '+':
    result = number_first + number_second
elif operation == '-':
    result = number_first - number_second
elif operation == '*':
    result = number_first * number_second
elif operation == '/':
    if number_second != 0:
        result = number_first / number_second
    else:
        result = "Error: Division by zero is not allowed."
else:
    result = "Error: Invalid operation."

print("Result:", result)