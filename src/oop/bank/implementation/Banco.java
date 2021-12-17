package oop.bank.implementation;
import java.util.List;

public class Banco implements IBanco{

	private String nome;
	private List<Conta> contas;
	
	private List<Cliente> clientes;

	
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	@Override
	public void exibirListaClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
		
	}
	
}
