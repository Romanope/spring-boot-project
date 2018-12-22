package com.crps.contato.ws.operadora.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.crps.contato.ws.operadora.model.Operadora;

@Repository
public class OperadoraDAO {

	private static Map<String, Operadora> operadoras;
	
	static {
		operadoras = new HashMap<>();
		operadoras.put(Operadora.TIM.getCodigo(), Operadora.TIM);
		operadoras.put(Operadora.CLARO.getCodigo(), Operadora.CLARO);
		operadoras.put(Operadora.EMBRATEL.getCodigo(), Operadora.EMBRATEL);
	}
	
	public List<Operadora> buscarOperadoras () {
		
		return new ArrayList<>(operadoras.values());
	}
	
	public Operadora buscarOperadora (String codigo) {
		
		return operadoras.get(codigo);
	}
	
	public Operadora cadastrar (Operadora operadora) {
		
		operadoras.put(operadora.getCodigo(), operadora);
		
		return operadoras.get(operadora.getCodigo());
	}
	
}
