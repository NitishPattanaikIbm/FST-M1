def filter_odd_from_list(lst):
    return [num for num in lst if num % 2 != 0]

def filter_even_from_list(lst):
    return [num for num in lst if num % 2 == 0]

def main():
    # Prompt the user to enter the first list of numbers
    list1_input = input("Enter the first list of numbers separated by spaces: ")
    list2_input = input("Enter the second list of numbers separated by spaces: ")

    try:
        # Convert the input strings to lists of integers
        list1 = [int(num) for num in list1_input.split()]
        list2 = [int(num) for num in list2_input.split()]

        # Filter odd numbers from the first list
        odd_numbers = filter_odd_from_list(list1)
        # Filter even numbers from the second list
        even_numbers = filter_even_from_list(list2)

        # Create the new list with odd numbers from the first list and even numbers from the second list
        new_list = odd_numbers + even_numbers

        # Print the new list
        print(f"The new list containing odd numbers from the first list and even numbers from the second list is: {new_list}")

    except ValueError:
        print("Invalid input. Please enter only numbers separated by spaces.")

if __name__ == "__main__":
    main()
