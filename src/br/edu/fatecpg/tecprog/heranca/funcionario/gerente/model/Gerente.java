package br.edu.fatecpg.tecprog.heranca.funcionario.gerente.model;

import br.edu.fatecpg.tecprog.heranca.funcionario.model.Funcionario;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, int cdFuncionario, float salario) {
		super(nome, cdFuncionario, salario);
	}
	
	public void fecharCaixa() {
		System.out.println("Caixa fechado");
	}
}
