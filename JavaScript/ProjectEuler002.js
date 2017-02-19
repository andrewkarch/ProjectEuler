window.onload=function() {
    var total = 0;
    var counter = 0;
    while(counter < 1000) {
        if(counter % 3 == 0 || counter % 5 == 0) 
            total += counter; 
        counter++;
    }
    document.getElementById("result").innerHTML += "Project Euler #2<br/>";
    document.getElementById("result").innerHTML += "Total: "; 
    document.getElementById("result").innerHTML += total;
}
