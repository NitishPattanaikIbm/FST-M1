def check_first_last_same(numbers):
    # Check if the list is not empty and the first and last elements are the same
    if numbers and numbers[0] == numbers[-1]:
        return True
    return False

def main():
    # Prompt the user to enter numbers separated by spaces
    user_input = input("Enter numbers separated by spaces: ")

    # Split the input string into a list of strings
    number_strings = user_input.split()

    try:
        # Convert the list of strings to a list of integers
        numbers = [int(num) for num in number_strings]

        # Check if the first and last numbers are the same
        result = check_first_last_same(numbers)

        # Print the result
        if result:
            print("The first and last numbers are the same.")
        else:
            print("The first and last numbers are different.")

    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")

if __name__ == "__main__":
    main()
