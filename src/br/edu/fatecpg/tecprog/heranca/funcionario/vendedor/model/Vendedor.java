package br.edu.fatecpg.tecprog.heranca.funcionario.vendedor.model;

import br.edu.fatecpg.tecprog.heranca.funcionario.model.Funcionario;

public class Vendedor extends Funcionario{
	
	public Vendedor(String nome, int cdFuncionario, float salario) {
		super(nome, cdFuncionario, salario);
	}
	
	public void realizarVenda() {
		System.out.println("Venda realizada");
	}
}
