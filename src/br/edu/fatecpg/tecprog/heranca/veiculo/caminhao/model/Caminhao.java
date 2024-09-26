package br.edu.fatecpg.tecprog.heranca.veiculo.caminhao.model;

import br.edu.fatecpg.tecprog.heranca.veiculo.model.Veiculo;

public class Caminhao extends Veiculo{
	
	private boolean estaCarregado;
	private String carga;
	private String nomeEmpresa;
	
	public Caminhao (String placa, String marca, String modelo, float peso) {
		super(placa, marca, modelo, peso);
	}

	public boolean isEstaCarregado() {
		return this.estaCarregado;
	}

	public void setEstaCarregado(boolean estaCarregado) {
		this.estaCarregado = estaCarregado;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
}
