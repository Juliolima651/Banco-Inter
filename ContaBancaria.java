
public class ContaBancaria{
	
	// depositar
	public double depositar;
	double valor;
	
	// pix
	public double pix;
	public double enviar;
	 String chave;
	
	// emprestimo
	private double emprestimo;
	
	// cartao de credito
	private double cartaoDeCredito;
	
	// Cartao De Debito
	private double CartaoDeDebito;
	
	// iniciar projeto
	
	// depositar
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double depositar() {
		return valor;
	}
	// area Pix
	
	public double pix() {
		return enviar;
	}
	
	// emprestimo
	public double emprestimo() {
		return emprestimo;
		
	}
	
	//Cartão de credito
	public double cartaoDeCredito() {
		return cartaoDeCredito;
	}
	
	// Cartão De Debito
	public double cartaoDeDebito() {
		return CartaoDeDebito;
	}
	

}
