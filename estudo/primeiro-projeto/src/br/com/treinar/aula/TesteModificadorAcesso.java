package br.com.treinar.aula;

/**
 * @author TREINAR
 *
 */
public class TesteModificadorAcesso {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.setNumero(100);
		System.out.println(c.getNumero());
	}
}