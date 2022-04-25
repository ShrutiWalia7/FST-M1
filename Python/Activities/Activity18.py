from dataclasses import dataclass
import pandas

dataframe = pandas.read_csv('employeeData.csv')
print(dataframe["Usernames"])
print("UserName:" + dataframe['Usernames'][2] , "Password:"+ dataframe['Passwords'][2])

print(dataframe.sort_values('Usernames') )
print(dataframe.sort_values('Passwords' , ascending = False) )