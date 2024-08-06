import pandas as pd

# Read the CSV file into a DataFrame
df = pd.read_csv('user_data.csv')

# Print the values only in the Usernames column
print("Usernames column:")
print(df['Usernames'])

# Print the username and password of the second row
print("\nUsername and password of the second row:")
print(f"Username: {df.loc[1, 'Usernames']}, Password: {df.loc[1, 'Passwords']}")

# Sort the Usernames column data in ascending order and print the data
sorted_usernames = df.sort_values(by='Usernames')
print("\nData sorted by Usernames in ascending order:")
print(sorted_usernames)

# Sort the Passwords column in descending order and print the data
sorted_passwords = df.sort_values(by='Passwords', ascending=False)
print("\nData sorted by Passwords in descending order:")
print(sorted_passwords)
