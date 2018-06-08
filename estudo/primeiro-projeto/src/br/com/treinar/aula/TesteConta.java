package br.com.treinar.aula;



public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(300);
		
		conta1.cliente = new Cliente();

	    System.out.println("O limite de credito:"+conta1.limiteCredito);
//		
//		Conta conta2 = conta1;
//		
//		conta1.cliente.cpf="033.661.526-48";
//		conta1.cliente.nome="Giovani Matozinhos Munhos";
//		conta1.numero=105;
//		conta1.saldo=5000000.00;
//		
//		System.out.println("Nome do cliente:"+conta1.cliente.nome);
//		System.out.println("Saldo:"+conta1.saldo);
//		System.out.println("Numero da conta:"+conta1.numero);
//		System.out.println("Numero da conta2:"+conta2.numero);
//		
//		System.out.println("Numero da conta:"+conta1.numero);
//		
//		conta1.sacar(1000000);
//		
//		System.out.println("O saldo da conta e: "+conta1.saldo);
//				
//		Conta conta3 = new Conta();
//		conta3.cliente=new Cliente();
//		
//		conta3.cliente.cpf="0001010010101";
//		conta3.cliente.nome="Jose";
//		conta3.numero=201;
//		conta3.saldo=500;
//		System.out.println("O saldo inicial e:"+conta3.saldo);
//		
//		if (conta3.sacar(501)) {
//			System.out.println("O saldo depois do saque e:"+conta3.saldo);
//		} else {
//			System.out.println("Saque não realizado! Saldo insuficiente!");
//		}
//		
//		System.out.println("O saldo eh:"+conta3.consultarSaldo());
		
		
	}
}