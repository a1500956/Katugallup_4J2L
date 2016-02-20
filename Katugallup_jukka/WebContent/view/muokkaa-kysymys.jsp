<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="kysytty" type="java.lang.String" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Muokkaa kysymystä</title>
<link href="styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<h2>Kysymyksen muokkaus</h2>
<h4>HUOM! Kun muokkaat kysymystä, niin kaikki kyseiseen kysymykseen liittyneet edeltävät vastaukset poistetaan järjestelmästä.</h4>
<div class="lomake">
<h3>Muokkaa kysymystä:</h3>

<form method="post">
<textarea rows=1 cols=40 name="kysymysteksti" required><%=kysytty%>
</textarea><br><br>
<div><a href="listaa-kysymykset" class="button">Peruuta</a>
<input type="submit" name="submit-button" class="submit-button" value="Muokkaa" /></div>		
</form>
</div>
</body>
</html>