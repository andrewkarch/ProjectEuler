window.onload=function() {
	var value1 = 1;
	var value2 = 2;
	var value3 = 3;
    var total = 2;
	
    while(total < 4000000) 
	{
		if (value3 % 2 == 0) 
			total += value3; 	
		value1 = value2;
		value2 = value3;
		value3 = value1 + value2;
	}
    document.getElementById("result3").innerHTML = total;
}
