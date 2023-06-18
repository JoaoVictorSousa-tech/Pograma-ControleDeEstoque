<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("produtos");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="style2.css" />
<link rel="icon" href="imagens/logo_loja.jpg">
<title>Inventário</title>
</head>
<body>
	<header>
		<ul>
			<li><a href="index.html">Início</a></li>
			<li><a href="report">Relatório</a></li>
			<li><a href="sobre.html">Sobre Nós</a></li>
		</ul>
		<img src=imagens/logo_loja.jpg>
	</header>

	<h1>Inventário dos Produtos</h1>
	<div class="inventario">
		<a href="novo.html">Novo Produto</a>
	</div>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Preço</th>
				<th>Quantidade em Estoque</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getId()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getPreco()%></td>
				<td><%=lista.get(i).getQuantidade_estoque()%></td>
				<td class="btns"><a href="edit?id=<%=lista.get(i).getId()%>"
					class="edit">Editar</a> <a
					href="javascript: confirmar(<%=lista.get(i).getId()%>)"
					class="delete">Excluir</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

	<footer>
		<p>&copy; 2023 Controle de Estoque</p>
	</footer>
	<script src="scripts/confirmador.js"></script>
</body>
</html>