def sum_elements(elements):
    try:
        # Calculate the sum of all elements in the list
        total_sum = sum(elements)
        print(f"The sum of the elements is: {total_sum}")
    except TypeError:
        print("Error: The list contains non-numeric values.")
    except Exception as e:
        print(f"An unexpected error occurred: {e}")

def main():
    # Example usage
    elements = [1, 2, 3, 4, 5]  # Replace this list with your own list of numbers
    sum_elements(elements)

if __name__ == "__main__":
    main()
