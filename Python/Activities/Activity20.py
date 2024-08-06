import pandas as pd

# Read the Excel file into a DataFrame
df = pd.read_excel('contact_data.xlsx')

# Print the number of rows and columns
print("Number of rows and columns:")
print(df.shape)

# Print the data in the Emails column only
print("\nEmails column:")
print(df['Email'])

# Sort the data based on FirstName in ascending order and print the data
sorted_df = df.sort_values(by='FirstName')
print("\nData sorted by FirstName in ascending order:")
print(sorted_df)
