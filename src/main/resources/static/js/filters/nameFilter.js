/**
 * Passa o primeiro letra do nome para maiúsculo. 
 */

angular.module("listaTelefonica").filter("name", function () {
	return function (input) {
		var listaDeNomes = input.split(" ");
		var listaDeNomesFormatada = listaDeNomes.map(function (nome) {
			return nome.length > 2 ? nome.charAt(0).toUpperCase() + nome.substring(1).toLowerCase() : nome;
		});
		return listaDeNomesFormatada.join(" ");
	};
});