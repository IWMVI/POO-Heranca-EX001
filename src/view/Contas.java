package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {
	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setCliente("Fulano");
		poupanca.setNumConta(109988);
		poupanca.setSaldo(100f);
		poupanca.setDataRendimento(10);

		ContaEspecial especial = new ContaEspecial();
		especial.setCliente("Beltrano");
		especial.setNumConta(109977);
		especial.setLimite(100f);
		especial.setSaldo(100f);

		System.out.println("Cliente: " + poupanca.getCliente());
		System.out.println("Número da conta: " + poupanca.getNumConta());
		System.out.println("Saldo conta poupança R$ " + poupanca.getSaldo());
		poupanca.sacar(100f);
		System.out.println("Saldo R$: " + poupanca.getSaldo());
		poupanca.sacar(50f);
		System.out.println("Saldo após tentativa de saque de R$ 50 da poupança: " + poupanca.getSaldo());

		System.out.println();
		System.out.println("Cliente: " + especial.getCliente());
		System.out.println("Número da conta: " + especial.getNumConta());
		System.out.println("Saldo R$ " + especial.getSaldo());
		System.out.println("Limite: " + especial.getLimite());
		especial.sacar(100f);
		System.out.println("Saldo R$ " + especial.getSaldo());
		especial.sacar(50f);
		System.out.println("Saldo R$ " + especial.getSaldo());

		System.out.println();
		poupanca.depositar(200f);
		System.out.println("Após depósito de R$ 200 da poupança: " + poupanca.getSaldo());
		especial.depositar(200f);
		System.out.println("Após depósito de R$ 200 da especial: " + especial.getSaldo());

		System.out.println();
		poupanca.calcularNovoSaldo(10f);
		System.out.println("Saldo após rendimento R$ " + poupanca.getSaldo());
	}
}
