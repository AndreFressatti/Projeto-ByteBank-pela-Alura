package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldonInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldonInsuficienteException {
		
		ContaEspecial ce = new ContaEspecial(133, 899);
		ce.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(337, 567);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca (139, 364);
		cp.deposita(200.0);
		
		try {
			cc.transfere(1, cp);
		} catch (SaldonInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		System.out.println(Conta.getTotal());
	}
	
}
