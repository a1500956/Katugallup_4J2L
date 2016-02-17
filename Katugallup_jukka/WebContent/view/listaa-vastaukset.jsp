<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="katugallup.model.Vastaus"%>
<jsp:useBean id="kysytty" type="java.lang.String" scope="request" />
<jsp:useBean id="vastausLista" type="java.util.ArrayList<Vastaus> "
scope="request" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Katugallup vastaukset</title>
<link href="styles.css" rel="stylesheet" type="text/css">

</head>
	<body>

		<h2>Vastaukset kysymykseen:</h2><br><br>
		<h3><%=kysytty%></h3>
		<table class="listaa-kysymykset" width="600" border="1" align="center">
		<tr>
			<td><h4>VASTAAJA</h4></td>
			<td><h4>VASTAUS</h4></td>
			<td><h4>VASTAUSAJANKOHTA</h4></td>
				
		</tr>
			<%for(int i = 0; i < vastausLista.size(); i++) {%>
			<tr>
				<td><%=vastausLista.get(i).getVastaaja()%></td>
				<td><%=vastausLista.get(i).getVastausteksti()%></td>
				<td><%=vastausLista.get(i).getVastausaika()%></td>		
			</tr>
			
			<% } %>
		</table><br>

		<div class ="button"><a href="listaa-kysymykset">Takaisin kysymyksiin</a></div>
	</body>
</html>