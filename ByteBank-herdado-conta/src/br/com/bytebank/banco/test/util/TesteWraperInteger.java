package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWraperInteger {

	public static void main(String[] args) {

		String[] nomes = new String[5];

		int idade = 29; // Integer

		Integer idadeRef = Integer.valueOf(10); // aqui faz o autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // aqui faz o unboxing

		String s = args[0]; // "10"

		// Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);

		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef); // AutoBoxing

	}

}