
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Apresenta a quantidade de acessos a esta página</title>
</head>
<body>





<% progma_web.Contador.novoAcesso(); %>
 

primeiro acesso:
<b><%= progma_web.Contador.getDataInicial()  %></b>
<br>
Quantidade de acessos a esta página:
<b><%= progma_web.Contador.getQuantidadeAcessos()%></b>
<br>
horario do ultimo acesso:
<b><%= progma_web.Contador.getDateTime() %></b>
</body>
</html>