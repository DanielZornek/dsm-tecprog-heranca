package br.edu.fatecpg.tecprog.heranca.funcionario.model;

public class Funcionario {
	
	public String nome;
	public int cdFuncionario;
	public float salario;
	
	public Funcionario(String nome, int cdFuncionario, float salario) {
		this.nome = nome;
		this.cdFuncionario = cdFuncionario;
		this.salario = salario;
	}
	
	public void baterPonto() {
		System.out.println("Ponto batido");
	}
	public String solicitarMaterial(String Materiais) {
		return Materiais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCdFuncionario() {
		return cdFuncionario;
	}

	public void setCdFuncionario(int cdFuncionario) {
		this.cdFuncionario = cdFuncionario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
