package br.edu.fatecpg.tecprog.heranca.veiculo.carro.model;

import br.edu.fatecpg.tecprog.heranca.veiculo.model.Veiculo;

public class Carro extends Veiculo{ 
	
	private int quantidadeAssentos;
	
	public Carro(String placa, String marca, String modelo, float peso) {
		super(placa, marca, modelo, peso);
	}
	
	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}
	
	public int getQuantidadeAssentos() {
		return this.quantidadeAssentos;
	}
}
