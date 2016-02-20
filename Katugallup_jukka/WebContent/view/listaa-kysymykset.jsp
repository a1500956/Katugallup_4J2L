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
		<table class="listaa-kysymykset" width="auto" border="1" align="center">
		<tr>
			
			<td><h4>KYSYMYS</h4></td>
			<td><h4>TOIMINNOT</h4></td>
				
		</tr>
			<%for(int i = 0; i < kysymykset.size(); i++) {%>
			<tr>
				
				<td><div class="kysymykset"><%=kysymykset.get(i).getKysymysteksti()%></div></td>
				<td><div class="toiminnot"> <a href="LisaaVastaus?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>" class="button">Vastaa
				</a>		
				<a href="listaa-vastaukset?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>" class="button">
				Näytä vastaukset
				</a>			
				<a href="muokkaa-kysymys?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>" class="button">
				Muokkaa kysymystä
				</a>		
				<a href="poista-kysymys?id1=<%=kysymykset.get(i).getId()%><%=kysymykset.get(i).getKysymysteksti()%>" class="button">
				Poista kysymys
				</a></div>
				</td>								
			</tr>
			<% } %>
		</table><br>
		<a href="lisaa-kysymys" class="button">Lisää kysymys</a>
		
	</body>
</html>