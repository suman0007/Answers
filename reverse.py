import re

str1=input("Enter the string: ")

print( re.sub(r'[-\w]+', lambda w:w.group()[::-1],str1))