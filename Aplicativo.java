import java.util.Locale;
import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente("nome" , "cpf" , "dataNascimento");
		ContaBancaria cb = new ContaBancaria();
		
		System.out.println("Digite Seu Nome: ");
		cliente.setNome(sc.next());
		System.out.println("Digite Seu Cpf: ");
		cliente.setCpf(sc.next());
		System.out.println("Digite A Data De Nascimento: ");
		cliente.setDataNascimento(sc.next());
		System.out.println("Digite O Numero Da Conta: ");
		cliente.setNumeroConta(sc.next());
		System.out.println("Digite Seu Numero Celular: ");
		cliente.setNumeroCelular(sc.next());
		
	    String input = "";
	    
	    while(!input.equals("6")) {
	    	System.out.println("Digite 1 Para Deposito: ");
			System.out.println("Digite 2 Para Pix: ");
			System.out.println("Digite 3 Para emprestimo: ");
			System.out.println("Digite 4 Para Cartão De Credito: ");
			System.out.println("Digite 5 Para Cartão De Débito: ");
			System.out.println("Digite 6 Para Sair: ");
			
			input = sc.next();
			
			switch(input) {
			case "1":
				System.out.println("Digite O Valor Do Deposito: ");
				cb.setValor(sc.nextDouble());
				System.out.println("Seu Saldo Agora: ");
				System.out.println(cb.valor);
				break;
			case "2":
				System.out.println("Digite A Chave Pix: ");
				cb.chave = sc.next();
				System.out.println("Digite O Valor A Enviar: ");
				cb.enviar = sc.nextDouble();
				System.out.println("Seu Saldo é: ");
				System.out.println(cb.valor - cb.enviar);
				break;
			case "3":
				System.out.println("O Valor Que Voçê Tem Para Emprestimo É:");
				System.out.println(cb.valor * 150.0 / 100);
				break;
			case "4":
				System.out.println("Seu Cartão De Credito Tem Limite De: ");
				System.out.println(cb.valor * 300.00 / 100);
				break;
			case "5":
				System.out.println("Seu Saldo No Cartão De Debito É: ");
				System.out.println(cb.valor);
				break;
			case "6":
				System.out.println("Fim Do Progama");
				break;
				default:
					System.out.println("Opção Invalida! Digite Uma Opção de 1 A 5 ou '6' Para Sair.");
			
			}
			
	    }
	    
		sc.close();
    }
       }
