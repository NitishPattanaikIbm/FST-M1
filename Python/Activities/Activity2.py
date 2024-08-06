def main():
    # Ask the user for a number
    number = int(input("Please enter a number: "))

    # Determine if the number is even or odd
    if number % 2 == 0:
        print(f"The number {number} is even.")
    else:
        print(f"The number {number} is odd.")

if __name__ == "__main__":
    main()
