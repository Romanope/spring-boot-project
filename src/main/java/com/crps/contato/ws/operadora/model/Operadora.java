package com.crps.contato.ws.operadora.model;

public class Operadora {

	public static final Operadora TIM = new Operadora("TIM", "41", "Móvel", 10.00);
	public static final Operadora CLARO = new Operadora("CLARO", "21", "Móvel", 1.00);
	public static final Operadora EMBRATEL = new Operadora("Embratel", "11", "Fixo", 15.00);
	
	private String nome;
	private String codigo;
	private String categoria;
	private double preco;
	
	public Operadora(String nome, String codigo, String categoria, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
