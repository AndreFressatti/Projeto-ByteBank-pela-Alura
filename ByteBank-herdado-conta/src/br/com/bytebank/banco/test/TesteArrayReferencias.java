package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

			// int[] idades = new int[5];
			Object[] referencia = new Object[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(33, 44);
		referencia[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencia[2] =cliente; 
		
		ContaPoupanca ref =	(ContaPoupanca) referencia[1];
		
		System.out.println(ref);
		System.out.println(referencia[0]);
		System.out.println(referencia[1]);
		System.out.println(referencia[2]);
	}

}
	