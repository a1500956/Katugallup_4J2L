<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="kysytty" type="java.lang.String" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Poista kysymys</title>
<link href="styles.css" rel="stylesheet" type="text/css">

</head>
<body>
<h2 class="lause">Oletko varma, että haluat poistaa kysymyksen: " <%=kysytty%> "</h2>
<div class="lomake">

<form method="post">												
	<div><a href="listaa-kysymykset" class="button">Peruuta</a>		
	<input type="submit" name="submit-button" class="submit-button" value="Poista" /></div>	
</form>
</div>		
</body>
</html>