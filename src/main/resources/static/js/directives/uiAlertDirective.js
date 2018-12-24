angular.module("listaTelefonica").directive("uiAlert", function () {
	return {
		templateUrl: "view/uiAlert.html",
		replace: true,
		restrict: "E",
		scope: {
			titulo: "@title",
			message: "=msg"
		}
	}
});