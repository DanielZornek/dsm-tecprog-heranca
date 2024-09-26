package br.edu.fatecpg.tecprog.heranca.veiculo.view;

import br.edu.fatecpg.tecprog.heranca.veiculo.carro.model.Carro;
import br.edu.fatecpg.tecprog.heranca.veiculo.moto.model.Moto;
import br.edu.fatecpg.tecprog.heranca.veiculo.caminhao.model.Caminhao;

public class Main {
	public static void main(String[] args) {
		Carro fiatUno1 = new Carro("dwl-9048", "FIAT", "Uno", (float) 450.99);
		
		fiatUno1.setQuantidadeAssentos(5);
		
		Moto hondaCgStart = new Moto("hjd-3478", "Honda", "CG Start 260", (float) 90.99);
		
		hondaCgStart.setCilindrada(168);
		
		Caminhao fnm = new Caminhao("habc-3678", "Alfa Romeo", "FNM", (float) 790.99);
		
		fnm.setEstaCarregado(true);
		fnm.setCarga("Madeira");
		fnm.setNomeEmpresa("DSL");
		
		System.out.println("Informações do carro: ");
		System.out.println("PLACA: "+fiatUno1.getPlaca());
		System.out.println("MARCA: "+fiatUno1.getMarca());
		System.out.println("MODELO: "+fiatUno1.getModelo());
		System.out.println("PESO: "+fiatUno1.getPeso());
		System.out.println("QUANTIDADE DE ASSENTOS: "+fiatUno1.getQuantidadeAssentos());
		
		System.out.println("\nInformações do moto: ");
		System.out.println("PLACA: "+hondaCgStart.getPlaca());
		System.out.println("MARCA: "+hondaCgStart.getMarca());
		System.out.println("MODELO: "+hondaCgStart.getModelo());
		System.out.println("PESO: "+hondaCgStart.getPeso());
		System.out.println("CILINDRADA: "+hondaCgStart.getCilindrada());
		
		System.out.println("\nInformações do Caminhão: ");
		System.out.println("PLACA: "+fnm.getPlaca());
		System.out.println("MARCA: "+fnm.getMarca());
		System.out.println("MODELO: "+fnm.getModelo());
		System.out.println("PESO: "+fnm.getPeso());
		System.out.println("CARREGADO?: " + (fnm.isEstaCarregado() ? "sim " : "não"));
		System.out.println("CARGA: "+fnm.getCarga());
		System.out.println("NOME DA EMPRESA TRANSPORTADORA: "+fnm.getNomeEmpresa());
	}
}
