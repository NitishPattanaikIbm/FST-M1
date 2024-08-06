def print_multiplication_table(number):
    print(f"Multiplication Table for {number}:")
    for i in range(1, 11):
        result = number * i
        print(f"{number} x {i} = {result}")

def main():
    # Ask the user for a number
    try:
        number = int(input("Enter a number to create its multiplication table: "))
        print_multiplication_table(number)
    except ValueError:
        print("Invalid input. Please enter a valid integer.")

if __name__ == "__main__":
    main()
