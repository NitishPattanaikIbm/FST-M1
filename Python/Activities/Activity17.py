import pandas as pd

# Define the data as a dictionary
data = {
    'Usernames': ['admin', 'Charles', 'Deku'],
    'Passwords': ['password', 'Charl13', 'AllMight']
}

# Create a DataFrame from the data
df = pd.DataFrame(data)

# Write the DataFrame to a CSV file
df.to_csv('user_data.csv', index=False)

print("Data has been written to 'user_data.csv'.")
