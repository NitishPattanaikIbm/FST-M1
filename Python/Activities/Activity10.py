def print_divisible_by_5(tup):
    # Iterate through the tuple and print numbers divisible by 5
    for num in tup:
        if num % 5 == 0:
            print(num)

def main():
    # Prompt the user to enter a tuple of numbers
    user_input = input("Enter numbers separated by spaces to form a tuple: ")

    try:
        # Convert the input string into a tuple of integers
        number_strings = user_input.split()
        numbers_tuple = tuple(int(num) for num in number_strings)

        # Print numbers divisible by 5
        print("Numbers divisible by 5 in the tuple:")
        print_divisible_by_5(numbers_tuple)

    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")

if __name__ == "__main__":
    main()
