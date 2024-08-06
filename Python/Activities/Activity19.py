import pandas as pd

# Define the data as a dictionary
data = {
    'FirstName': ['Satvik', 'Avinash', 'Lahri'],
    'LastName': ['Shah', 'Kati', 'Rath'],
    'Email': ['satshah@example.com', 'avinashk@example.com', 'lahri.rath@example.com'],
    'PhoneNumber': [4537829158, 5892184058, 4528727830]
}

# Create a DataFrame from the data
df = pd.DataFrame(data)

# Write the DataFrame to an Excel file
df.to_excel('contact_data.xlsx', index=False)

print("Data has been written to 'contact_data.xlsx'.")
