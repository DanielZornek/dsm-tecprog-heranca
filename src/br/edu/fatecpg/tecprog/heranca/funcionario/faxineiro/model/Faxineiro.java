package br.edu.fatecpg.tecprog.heranca.funcionario.faxineiro.model;

import br.edu.fatecpg.tecprog.heranca.funcionario.model.Funcionario;

public class Faxineiro extends Funcionario{
	public Faxineiro(String nome, int cdFuncionario, float salario) {
		super(nome, cdFuncionario, salario);
	}
	
	public void limparChao() {
		System.out.println("Chão limpo");
	}
}
