def fibonacci(n):
    # Base cases: return n if n is 0 or 1
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        # Recursive case: return the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2)

def generate_fibonacci_series(count):
    series = []
    for i in range(count):
        series.append(fibonacci(i))
    return series

def main():
    try:
        # Ask the user how many Fibonacci numbers to generate
        count = int(input("How many Fibonacci numbers would you like to generate? "))
        
        if count <= 0:
            print("Please enter a positive integer.")
        else:
            # Generate the Fibonacci series
            series = generate_fibonacci_series(count)
            print(f"The first {count} Fibonacci numbers are: {series}")
    except ValueError:
        print("Invalid input. Please enter an integer.")

if __name__ == "__main__":
    main()
