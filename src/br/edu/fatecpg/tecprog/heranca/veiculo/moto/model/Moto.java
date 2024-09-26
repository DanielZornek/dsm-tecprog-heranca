package br.edu.fatecpg.tecprog.heranca.veiculo.moto.model;

import br.edu.fatecpg.tecprog.heranca.veiculo.model.Veiculo;

public class Moto extends Veiculo{
	
	private int cilindrada;
	
	public Moto(String placa, String marca, String modelo, float peso) {
		super(placa, marca, modelo, peso);
	}
	
	public void Empinar() {
		System.out.println("bolololololololo ouopuiou");
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
