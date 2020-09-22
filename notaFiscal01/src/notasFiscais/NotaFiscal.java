package notasFiscais;

public class NotaFiscal {
	private String numeroDaPeca;
	private String descricaoPeca;
	private int quantidadeComprada;
	private double preco;
	
	public void setnumeroDaPeca(String numPeca) {
		this.numeroDaPeca = numPeca;
	}
	public void setDescricaoPeca(String descricao) {
		this.descricaoPeca = descricao;
	}
	public void setquantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getNumeroDaPeca() {
		return this.numeroDaPeca;
	}
	public String getDescricaoPeca() {
		return this.descricaoPeca;
	}
	public int getQuantidadePeca() {
		return this.quantidadeComprada;
	}
	public double getPreco() {
		return this.preco;
	}
	public double getValorTotal() {
		return this.quantidadeComprada * this.preco;
	}
	
	

}
