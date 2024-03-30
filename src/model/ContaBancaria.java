package model;

public class ContaBancaria {

	private String cliente;
	private int numConta;
	private float saldo;

	public ContaBancaria() {

	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Não há saldo suficienta na conta.");
		}
	}

	public float depositar(float valor) {
		return valor > 0.0f ? saldo += valor : 0;
	}
}
