/**
 * Confirmando exclusão de Produto
 * @author João Victor
 */

function confirmar(id) {
	const resposta = confirm("Você realmente quer excluir este produto?");
	if (resposta === true) {
		window.location.href = "delete?id=" + id;
	}
}