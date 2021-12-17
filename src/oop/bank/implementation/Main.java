package oop.bank.implementation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco bbb = new Banco();
		bbb.setNome("BBB");
		
		Cliente yuri = new Cliente();
		yuri.setNome("Yuri");
		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		Cliente marcos = new Cliente();
		marcos.setNome("Marcos");
		
		Conta cc0 = new ContaCorrente(yuri);
		Conta poupanca0 = new ContaPoupanca(yuri);
		
		Conta cc1 = new ContaCorrente(joao);
		Conta poupanca1 = new ContaPoupanca(joao);

		Conta cc2 = new ContaCorrente(marcos);
		Conta poupanca2 = new ContaPoupanca(marcos);

		cc0.depositar(100);
		//cc0.transferir(100, poupanca0);
		
		//tranferindo para Joao
		cc0.transferir(50, poupanca1);
		//transferindo para marcos
		cc0.transferir(50, poupanca2);
		
		
		
		cc0.imprimirExtrato();
		poupanca0.imprimirExtrato();
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		List<Cliente> lstClientes = new ArrayList<>();
		lstClientes.add(yuri);
		lstClientes.add(joao);
		lstClientes.add(marcos);
		
		bbb.setClientes(lstClientes);
		System.out.println("==========================================================");
		bbb.exibirListaClientes();
		
		
	}

}
