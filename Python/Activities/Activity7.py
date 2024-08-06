def main():
    # Prompt the user to enter numbers separated by spaces
    user_input = input("Enter numbers separated by spaces: ")

    # Split the input string into a list of strings
    number_strings = user_input.split()

    try:
        # Convert the list of strings to a list of integers
        numbers = [int(num) for num in number_strings]

        # Calculate the sum of all elements in the list
        total_sum = sum(numbers)

        # Print the result
        print(f"The sum of the numbers is: {total_sum}")

    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")

if __name__ == "__main__":
    main()
