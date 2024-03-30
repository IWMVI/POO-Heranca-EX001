package model;

public class ContaPoupanca extends ContaBancaria {

	private int dataRendimento;

	public ContaPoupanca() {
		super();
	}

	public int getDataRendimento() {
		return dataRendimento;
	}

	public void setDataRendimento(int dataRendimento) {
		this.dataRendimento = dataRendimento;
	}

	public void calcularNovoSaldo(float taxa) {
		float rendimento = getSaldo() * (taxa / 100);
		setSaldo(getSaldo() + rendimento);
	}
}
