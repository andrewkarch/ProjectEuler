number = 1;
Total = 0;
while number < 1000:
	if number % 3 == 0: 
		Total = Total + number;
	elif number % 5 == 0:
		Total = Total + number;
	number = number + 1
print "Total: = %d" %Total