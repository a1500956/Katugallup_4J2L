<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="katugallup.model.Kysymys"%>

<jsp:useBean id="kysymykset" type="java.util.ArrayList<Kysymys> "
scope="request" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Katugallup kysymykset</title>
<link href="styles.css" rel="stylesheet" type="text/css">

</head>
	<body>

		<h1>Katugallup kysymykset</h1>
		<table class="listaa-kysymykset" width="700" border="1" align="center">
		<tr>
			
			<td><h4>KYSYMYS</h4></td>
			<td><h4>TOIMINNOT</h4></td>
				
		</tr>
			<%for(int i = 0; i < kysymykset.size(); i++) {%>
			<tr>
				
				<td><%=kysymykset.get(i).getKysymysteksti()%></td>
				<td><a href="LisaaVastaus?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>">
				Vastaa
				</a>&nbsp;&nbsp;			
				<a href="listaa-vastaukset?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>"><br>
				Näytä vastaukset
				</a>&nbsp;&nbsp;			
				<a href="muokkaa-kysymys?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>"><br>
				Muokkaa kysymystä
				</a>&nbsp;&nbsp;			
				<a href="poista-kysymys?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>">
				Poista kysymys
				</a>
				</td>								
			</tr>
			<% } %>
		</table><br>
		<div class ="button"><a href="lisaa-kysymys">Lisää kysymys</a></div>
		
	</body>
</html>