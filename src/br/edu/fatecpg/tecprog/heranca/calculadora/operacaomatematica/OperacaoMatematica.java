package br.edu.fatecpg.tecprog.heranca.calculadora.operacaomatematica;

public interface OperacaoMatematica {
	public void rodarCalculadora();
	public void receberValores();
	public double soma(double valor1, double valor2);
	public double subtracao(double valor1, double valor2);
	public double multiplicacao(double valor1, double valor2);
	public double divisao(double valor1, double valor2);
}
