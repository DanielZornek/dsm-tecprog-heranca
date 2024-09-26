package br.edu.fatecpg.tecprog.heranca.pagamento.view;

import br.edu.fatecpg.tecprog.heranca.pagamento.model.*;

public class Main {
	public static void main(String[] args) {
		PagamentoCartao pagC = new PagamentoCartao(100.00);
		System.out.println("Pagamento com Cartão");
		pagC.calcularPagamento();
		pagC.emitirRecibo();
		
		System.out.println("\nPagamento com Dinheiro");
		PagamentoDinheiro pagD = new PagamentoDinheiro(100);
		pagD.calcularPagamento();
		pagD.emitirRecibo();
	}

}
