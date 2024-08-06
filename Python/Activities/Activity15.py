def main():
    try:
        # Intentionally cause a NameError by using an undefined variable
        print(undeclared_variable)
    except NameError as e:
        # Handle the NameError and print a custom message
        print(f"NameError caught: {e}")

    # Continue with the rest of the program
    print("Execution continues after handling the NameError.")

if __name__ == "__main__":
    main()
