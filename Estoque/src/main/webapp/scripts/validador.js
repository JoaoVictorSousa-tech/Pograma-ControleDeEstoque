/**
 * Validando formulário
 * @author João Victor
 */

function validar() {
	const nome = document.getElementById("nome").value;
	const preco = document.getElementById("preco").value;
	if (nome === "" || preco === "") {
		window.alert("Preencha o campo nome!");
		document.getElementById("nome").focus();
		document.getElementById("preco").focus();
		return false;
	} else {
		document.forms["formProduto"].submit();
	}
}