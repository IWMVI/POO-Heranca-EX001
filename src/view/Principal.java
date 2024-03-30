package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Principal {
	public static void main(String[] args) {
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setCliente("Fulano");
		poupanca.setNumConta(109988);
		poupanca.setSaldo(100);
		poupanca.setDataRendimento(10);

		ContaEspecial especial = new ContaEspecial();
		especial.setCliente("Beltrano");
		especial.setNumConta(109977);
		especial.setLimite(100);
		especial.setSaldo(100);

		System.out.println("Saldo conta poupança R$ " + poupanca.getSaldo());
		poupanca.sacar(100);
		System.out.println("Saldo após saque de R$ 100 da poupança: " + poupanca.getSaldo());
		poupanca.sacar(50);
		System.out.println("Saldo após tentativa de saque de R$ 50 da poupança: " + poupanca.getSaldo());

		System.out.println();
		System.out.println("Saldo conta especial R$ " + especial.getSaldo());
		especial.sacar(100);
		System.out.println("Saldo conta especial R$ " + especial.getSaldo());
		especial.sacar(50);
		System.out.println("Saldo conta especial R$ " + especial.getSaldo());

		System.out.println();
		poupanca.depositar(200);
		System.out.println("Após depósito de R$ 200 da poupança: " + poupanca.getSaldo());
		especial.depositar(200);
		System.out.println("Após depósito de R$ 200 da especial: " + especial.getSaldo());

		System.out.println();
		poupanca.calcularNovoSaldo(10);
		System.out.println("Saldo após rendimento R$ " + poupanca.getSaldo());
	}
}
