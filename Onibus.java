package prova03;

public class Onibus extends Empresa {

	private int numeroPassageiros;
	private int numeroMaxPassageiros;

	public Onibus(String marca, String modelo, int anoFabricacao, int numeroMaxPassageiros) {
		super(marca, modelo, anoFabricacao);
		this.numeroPassageiros = 0;
		this.numeroMaxPassageiros = numeroMaxPassageiros;
	}

	public int InserirPassageiros(int passageiros) {
		System.out.println(passageiros + " passageiros estão entrando no onibus");
		this.numeroPassageiros = this.numeroPassageiros + passageiros;
		return this.numeroPassageiros;
	}

	public int RetirarPassageiros(int passageiros) {
		if (this.numeroPassageiros == 0) {
			System.out.println("Onibus esta vazio");
			return this.numeroPassageiros;
		}

		if (passageiros > this.numeroPassageiros) {
			System.out.println("Todos os passageiros estao sendo retirados do onibus");
			this.numeroPassageiros = 0;
		} else {
			System.out.println(passageiros + " estao sendo retirados do onibus");
			this.numeroPassageiros = this.numeroPassageiros - passageiros;
		}
		return this.numeroPassageiros;
	}

	public void RealizarTransporte() {
		if (estado == true && this.numeroPassageiros > 0 && this.numeroPassageiros <= numeroMaxPassageiros) {

			System.out.println("O onibus esta ligado e com passageiros,o transporte esta sendo realizado");

		}
		if (estado == true && this.numeroPassageiros == 0) {
			System.out.println("O onibus esta ligado porem esta sem passageiros");
		}
		if (estado == true && this.numeroPassageiros > numeroMaxPassageiros) {
			System.out.println(
					"O onibus esta ligado porem esta no limite de passageiros,porfavor retire alguns passageiros antes de realizar o transporte");
		}

		if (estado == false) {
			System.out.println("O onibus esta desligado,porfavor ligue o onibus");
		}

	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getNumeroMaxPassageiros() {
		return numeroMaxPassageiros;
	}

	public void setNumeroMaxPassageiros(int numeroMaxPassageiros) {
		this.numeroMaxPassageiros = numeroMaxPassageiros;
	}

	@Override
	public String toString() {
		return super.toString() + "Onibus [numeroPassageiros=" + numeroPassageiros + ", numeroMaxPassageiros="
				+ numeroMaxPassageiros + "]";
	}

}
