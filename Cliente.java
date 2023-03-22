
public class Cliente extends Pessoa {
	private String numeroConta;
	private String numeroCelular;
	public Cliente(String nome, String cpf, String dataNascimento) {
		super(nome,cpf,dataNascimento);	
	}
	public String getNumeroConta() {
		return numeroConta;
		}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	

}
