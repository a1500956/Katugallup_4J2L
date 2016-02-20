<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="kysytty" type="java.lang.String" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Vastaa kysymykseen</title>
<link href="styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<h2><%=kysytty%></h2>
<div class="lomake">
<h4 class="alaotsikko">Lisää vastauksesi</h4>
<form class="vastaus" method="post">
Vastaaja:
<input type="text" value="" name="vastaaja" size="30" required/><br><br>
Vastauksesi:
<input type="text" value="" name="vastausteksti" size="50" required/><br><br>
<div><a href="listaa-kysymykset" class="button">Peruuta</a>
<input type="submit" name="submit-button" class="submit-button" value="Tallenna" /></div>	
</form>
</div>		
</body>
</html>