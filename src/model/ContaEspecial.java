package model;

public class ContaEspecial extends ContaBancaria {

	private float limite;

	public ContaEspecial() {
		super();
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(float valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
		} else if (valor <= limite) {
			float saque = valor - limite;
			setSaldo(saque);
			System.out.println("Limite disponível R$ " + limite);
		} else {
			System.out.println("Não há limite disponível!");
		}
	}
}
