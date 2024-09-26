package br.edu.fatecpg.tecprog.heranca.calculadora.model;

import br.edu.fatecpg.tecprog.heranca.calculadora.operacaomatematica.OperacaoMatematica;
import java.util.Scanner;

public class Calculadora implements OperacaoMatematica{
	Scanner entrada = new Scanner(System.in);
	
	public double valor1;
	public double valor2;
	public int opcao;
	@Override
	public void rodarCalculadora() {
		System.out.print("\nEscolha a operação:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n");
		this.opcao = entrada.nextInt();
		
		this.receberValores();
		
		switch(opcao) {
			case 1:
				System.out.println(this.soma(valor1, valor2));
			break;
			case 2:
				System.out.println(this.subtracao(valor1, valor2));
			break;
			case 3:
				System.out.println(this.multiplicacao(valor1, valor2));
			break;
			case 4:
				System.out.println(this.divisao(valor1, valor2));
			break;
			default:
				System.out.println("Entrada Inválida");
			break;
		}
		
	}
	@Override
	public void receberValores() {
		System.out.print("Valor 1: ");
		this.valor1 = entrada.nextDouble();
		System.out.print("Valor 2: ");
		this.valor2 = entrada.nextDouble();
	}
	@Override
	public double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}
	@Override
	public double subtracao(double valor1, double valor2) {
		return valor1 - valor2;
	}
	@Override
	public double multiplicacao(double valor1, double valor2) {
		return valor1 * valor2;
	}
	@Override
	public double divisao(double valor, double valor2) {
		return valor / valor2;
	}
	
}
