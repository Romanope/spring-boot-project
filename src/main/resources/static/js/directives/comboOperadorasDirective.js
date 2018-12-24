angular.module("listaTelefonica").directive("comboOperadoras", function () {
	return {
		templateUrl: "partials/comboOperadoras.html",
		replace: true,
		restrict: "E",
		scope: {
			operadoras: "=operadoras",
			oper: "=operadora"
		}
	}
});