def sum_recursive(n):
    # Base case: when n is 0, the sum is 0
    if n == 0:
        return 0
    # Recursive case: n plus the sum of numbers up to n-1
    else:
        return n + sum_recursive(n - 1)

def main():
    # Calculate the sum of numbers from 0 to 10
    result = sum_recursive(10)
    print(f"The sum of numbers from 0 to 10 is: {result}")

if __name__ == "__main__":
    main()
