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
		<form method="post">
			<table class="lisaa-vastaus" align=center>
				
				<tr>
					<td>Vastaaja:</td>
					<td><input type="text" 
					value=""
					name="vastaaja" size="30" required/>
					</td>
				</tr>
				<tr>
					<td>Vastauksesi:</td>
					<td><input type="text" 
					value=""
					name="vastausteksti" size="50" required/>
					</td>
				</tr>						
				<tr>
					<td><div class ="button"><a href="listaa-kysymykset">Peruuta</a></div></td>
					<td>
						<input type="submit" name="submit-button" class="submit-button" value="Tallenna" />
					</td>
				</tr>	
			</table>
			</form>
</div>		
</body>
</html>