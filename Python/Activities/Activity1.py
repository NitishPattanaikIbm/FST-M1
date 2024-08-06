import datetime

def main():
    # Ask the user for their name and age
    name = input("Please enter your name: ")
    age = int(input("Please enter your age: "))

    # Get the current year
    current_year = datetime.datetime.now().year

    # Calculate the year the user will turn 100
    year_turn_100 = current_year + (100 - age)

    # Print the message
    print(f"Hello {name}, you will turn 100 years old in the year {year_turn_100}.")

if __name__ == "__main__":
    main()