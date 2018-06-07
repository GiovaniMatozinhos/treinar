package br.com.treinar.aula;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Giovani Matozinhos";
		
		
		Pessoa pessoa2 = pessoa1;
		Pessoa pessoa3 = pessoa1;
		
		System.out.println("O nome da Pessoa1 e: "+pessoa1.nome);
		System.out.println("O nome da Pessoa2 e: "+pessoa2.nome);
		System.out.println("O nome da Pessoa3 e: "+pessoa3.nome);
		
		pessoa2 = new Pessoa();
		pessoa2.nome="Nilciane Matozinhos";
		System.out.println("O nome da Pessoa2 e: "+pessoa2.nome);

	}
}