package br.edu.fatecpg.tecprog.heranca.pagamento.model;

public class PagamentoDinheiro implements Pagamento{
	
	private double valor;
	private double valorComTaxa;
	
	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}
	
	public double getvalorComTaxa() {
		return this.valorComTaxa;
	}
	
	public double getValor() {
		return this.valor;
	}

	@Override
	public void calcularPagamento() {
		this.valorComTaxa = this.valor - (this.valor * 0.10);
	}

	@Override
	public void emitirRecibo() {
		System.out.println("Valor do Pagamento: "+this.valor+"\nValor com Desconto de 10%: "+this.valorComTaxa);
	}
	
}
