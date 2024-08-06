def check_fruit_availability(fruit_dict, fruit):
    # Check if the fruit is in the dictionary
    if fruit in fruit_dict:
        print(f"{fruit} is available at Rs {fruit_dict[fruit]:.2f}")
    else:
        print(f"{fruit} is not available.")

def main():
    # Create a dictionary of fruits and their prices
    fruits_prices = {
        "apple": 120,
        "banana": 50,
        "cherry": 200,
        "date": 300,
        "fig": 250,
        "grape": 180
    }

    # Prompt the user to enter a fruit to check its availability
    user_input = input("Enter the name of the fruit to check its availability: ").lower()

    # Check if the entered fruit is available in the dictionary
    check_fruit_availability(fruits_prices, user_input)

if __name__ == "__main__":
    main()
