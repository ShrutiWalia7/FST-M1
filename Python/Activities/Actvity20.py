import pandas

dataframe = pandas.read_excel("Activity19Data.xlsx")
print("======= Print row and column ======")
print(dataframe.shape)

print("======= Print Email address ======")
print(dataframe["Email"])

print("======= Print data with FirstName in ascending order ======")
print(dataframe.sort_values('FirstName'))