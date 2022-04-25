import pandas
 
# Structure our data as a dictionary
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charles", "AllMight"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("employeeData.csv" , index=False)
