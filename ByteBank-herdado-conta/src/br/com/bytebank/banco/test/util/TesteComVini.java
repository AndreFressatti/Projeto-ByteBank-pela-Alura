package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldonInsuficienteException;
 
public class TesteComVini {

	public static void main(String[] args) throws SaldonInsuficienteException {

		Conta Vini = new ContaCorrente(11, 22);
		Vini.deposita(1500.0);
		
		Conta andre = new ContaCorrente(11, 33);
		andre.deposita(1000);
		
		andre.transfere(500, Vini);
		
		System.out.println(Vini.getSaldo());
		
		System.out.println(Vini.toString());
		
	}

}
