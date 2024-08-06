def print_pattern():
    for i in range(1, 10):  # Outer loop for each row
        for j in range(i):  # Inner loop for printing numbers in each row
            print(i, end='')  # Print the number i without a newline
        print()  # Move to the next line after printing all numbers in the current row

def main():
    print_pattern()

if __name__ == "__main__":
    main()
