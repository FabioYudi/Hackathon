<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<script src="../resources/js/jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<button type="button" onclick="realizarRequisicaoAjax()">Exemplo chamada Via Ajax</button>
	<div id="data"></div>
</body>

<script>

function realizarRequisicaoAjax(){
	$.ajax({
		  url: "/consultaViaAjax/exemplos"
		}).done(function(data) {
		   console.log(data);
		   $("#data").html(data);
		});


}


</script>
</html>