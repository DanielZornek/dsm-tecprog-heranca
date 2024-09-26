package br.edu.fatecpg.tecprog.heranca.veiculo.model;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private float peso;
	
	public Veiculo(String placa, String marca, String modelo, float peso) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}
	
	public void ligar() {
		System.out.println("Veículo ligado");
	}
	
	public void desligar() {
		System.out.println("Veículo desligado");
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
