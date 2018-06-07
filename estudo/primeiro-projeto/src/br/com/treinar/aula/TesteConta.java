package br.com.treinar.aula;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.cliente = new Cliente();
		
		
		conta1.cliente.cpf="033.661.526-48";
		conta1.cliente.nome="Giovani Matozinhos Munhos";
		conta1.numero=105;
		conta1.saldo=5000000.00;
		
		System.out.println("Nome do cliente:"+conta1.cliente.nome);
		System.out.println("Saldo:"+conta1.saldo);
		System.out.println("Numero da conta:"+conta1.numero);
	}
}
