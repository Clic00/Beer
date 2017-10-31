<%@ page import="java.util.*"%>

<html>
<title>Beer Recommendations JSP</title>
<body>
<h1 align="center"> Recomendações de Cervejas JSP</h1>
<p>
<%
	out.println("<br>Hoje: "+request.getAttribute("time"));
	out.println("<br><br>Conselhos sobre escolha de cervejas.<br>");

	
	String cor = (String) request.getAttribute("color");
	List<String> styles = (List<String>) request.getAttribute("styles");
//	Iterator it = styles.iterator();
	
	out.println("<br>Escolheu a cerveja de cor: " + cor.toUpperCase());
	out.println("<br><br>Cervejas relacionadas para experimentar: ");
	
	for(String c : styles) {
		out.println("<br>" + c);
	}
	
//	while(it.hasNext()){
//		out.print("<br>Experimente: "+ it.next());
		
//	}
%>
	<br><br>
<div align="center">
<input type='button' onclick='javascript:history.back();self.location.reload()' value='  Voltar  ' name='Voltar' >
</div>	

</body>
</html>