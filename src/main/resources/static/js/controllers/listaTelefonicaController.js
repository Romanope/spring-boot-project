angular.module("listaTelefonica").controller("listaTelefonicaController", function ($scope, $http, contatosAPI, operadoraAPI, serialGenerator) {
		
		console.log(serialGenerator.generate());
		$scope.app = "Lista Telefonica";
		$scope.contatos = [];
		$scope.operadoras = [];

		var carregarContatos = function () {
			contatosAPI.getContatos().then(function (response) {
				$scope.contatos = response.data;
			}, function (response) {
				$scope.error = "Erro ao carregar lista de contatos.";
			});
		};

		var carregarOperadoras = function () {
			operadoraAPI.getOperadoras().then(function (response) {
				$scope.operadoras = response.data;	
			});
		};
		
		$scope.adicionarContato = function (contato) {
			contato.serial = serialGenerator.generate();
			contatosAPI.cadastrar(contato).then(function (response) {
				delete $scope.contato;
				$scope.contatoForm.$setPristine();
				carregarContatos();
			}, function (response) {
				$scope.error = "Erro ao cadastrar contato. " + response.data 
			});
		};

		$scope.removerContato = function (contatos) {
			$scope.contatos = contatos.filter(function (contato) {
				if (!contato.selecionado) return contato;
			});
		};

		$scope.isContatoSelecionado = function (contatos) {
			return contatos.some(function (contato) {
				return contato.selecionado;
			});
		};

		$scope.isApenasUmSelecionado = function (contatos) {
			var contatosSelecionados = contatos.filter(function(contato) {
				if (contato.selecionado) return contato;
			});

			return contatosSelecionados.length == 1;
		}

		$scope.editarContato = function (contatos) {
			for (i in contatos) {
				if (contatos[i].selecionado) {
					$scope.contato.nome = contatos[i].nome;
					$scope.contato.telefone = contatos[i].telefone;
					break;
				}
			}
		};
		
		var isDataValida = function (data) {
			if (!data) return false;
			var dataArray = data.split("/");
			if (dataArray.length !== 3) return false;
			return dataArray[0].length == 2 && dataArray[1].length == 2 && dataArray[2].length == 4;
			
		}
		
		$scope.atualizarListaOperadoras = function () {
			if (isDataValida($scope.contato.data)) {
				carregarOperadoras();
			}
		};

		$scope.ordernarPor = function (campo) {
			$scope.campoDeOrdenacao = campo;
			$scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
		};
		carregarContatos();
		carregarOperadoras();
});