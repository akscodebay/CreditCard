<html>
<head>
<title>CreditCard-Home Page</title>
<style type="text/css">
body{
background-color: silver;
}
div{
padding: 20px;
text-align: center;
font-size: 50px;
}
label{
margin-left: 30%;
font-size: 30px;
padding-right: 10px;
}
input{
padding: 10px;
border-radius: 4px;
border: 2px solid green;
}
input[type=submit]{
margin-left: 47%;
margin-top: 20px;
padding: 10px;
}
input[type=submit]:hover{
background-color: lime;	
}
</style>
</head>
<body>
<div id="header">Check for Credit Card Eligibility</div>
<form action="checkEligibility" method="post">
<label>Enter PAN Number</label>
<input id="panNo" name="pan" type="text" placeholder="PAN Number" pattern="[A-Za-z0-9]{10}" title="10 character alpha numeric" required>
<br>
<input id="submit" type="submit" value="Check">
</form>
</body>
</html>
