package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerealizacao {

	public static void main(String[] args) throws Exception, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Andre");
		cliente.setProfissao("Dev");
		cliente.setCpf("11244243-4");

		ContaCorrente cc = new ContaCorrente(11, 22);
		cc.setTitular(cliente);
		cc.deposita(222.3);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
