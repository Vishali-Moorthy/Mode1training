/**
 * 
 */
function show() {
	var arr=[3, 'hello',
	           function() {
					return "Welcome"},
					{'city' : 'Chennai',
					'state' : 'TN'}
					];
	var res="";
	res+="First Element " +arr[0] + "<br/>";
	res+="Second Element " +arr[1] + "<br/>";
	res+="Third Element " +arr[2]() + "<br/>";
	res+="Key value 1 " +arr[3].city + "<br/>";
	res+="Key value 2 " +arr[3].state + "<br/>";
	
	document.getElementById("res").innerHTML=res;
}