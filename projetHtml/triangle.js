function test()
{
	var a =parseInt(document.getElementById("number").value);
	var b =parseInt(document.getElementById("number1").value);
	var c =parseInt(document.getElementById("number2").value);
	
	if(a>0&& b>0&& c>0)
		{
		
		
		if (a != b && a != c && b != c) {
			
			window.open('scalene.html', '_blank');
		} else if (a == b &&( a != c || b != c) ||a == c &&( a != b || b != c) ||b == c &&( a != b || b != c)) {
			
			window.open('isoc.html', '_blank');
		} else if (a == b && a == c && b == c) {
			window.open('equilateral.html', '_blank');
		}
		
		}
		else
		{
			alert("Vous avez rentré une valeur négative ");
		}
	 
	alert(addition);
	
}