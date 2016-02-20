<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="author" content="Syntax Terror">

<link href="styles.css" rel="stylesheet" type="text/css">
<title>Lisää kysymys</title>
</head>

<body>
<h2>Lisää kysymys</h2>
<form method="post">		
Kysymys:
<input type="text" value="" name="kysymysteksti" size="50" required  /><br><br>
<a href="listaa-kysymykset" class="button">Peruuta</a>			
<input type="submit" name="submit-button" class="submit-button" value="Tallenna" />
</form>	
</body>
</html>