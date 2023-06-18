<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style4.css" />
<link rel="icon" href="imagens/logo_loja.jpg">
<title>Editando</title>
</head>
<body>
	<header>
		<ul>
			<li><a href="index">Início</a></li>
			<li><a href="main">Produtos</a></li>
			<li><a href="sobre.html">Sobre Nós</a></li>
		</ul>
		<img src=imagens/logo_loja.jpg>
	</header>
	<h1>Editar produto</h1>
	<form name="formProduto" action="update">
		<table>
			<tr>
				<td><input type="text" name="id" id="id" readonly
					value="<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" id="nome"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="preco" id="preco"
					value="<%out.print(request.getAttribute("preco"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="quantidade" id="quantidade"
					value="<%out.print(request.getAttribute("quantidade_estoque"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="btn" onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>