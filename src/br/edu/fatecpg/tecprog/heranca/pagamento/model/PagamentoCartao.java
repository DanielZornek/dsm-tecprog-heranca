package br.edu.fatecpg.tecprog.heranca.pagamento.model;

public class PagamentoCartao implements Pagamento{
	private double valor;
	private double valorComTaxa;
	
	public PagamentoCartao(double valor) {
		this.valor = valor;
	}
	
	public double getValorComTaxa() {
		return this.valorComTaxa;
	}
	
	@Override
	public void calcularPagamento() {
		this.valorComTaxa = valor * 1.05; 
	}
	
	@Override
	public void emitirRecibo() {
		System.out.println("Valor do Pagamento: "+this.valor+"\nValor com Taxa do Cartão: "+this.valorComTaxa);
	}
	
}
