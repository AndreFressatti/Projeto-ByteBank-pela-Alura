package br.com.bytebank.banco.modelo;


public class SaldonInsuficienteException extends Exception {

	public SaldonInsuficienteException(String msg) {
		super(msg);
	}
}
