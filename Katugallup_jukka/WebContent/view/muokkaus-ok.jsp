<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="muokkausOk" type="java.lang.String" scope="request" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Muokkaa</title>
<link href="styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="vastausOK">
<h2 class="lause"><%=muokkausOk %></h2></div><br><br>
<div><a href="listaa-kysymykset" class="button">Takaisin kysymyksiin</a></div>
</body>
</html>