package prova03;

public class Caminhao extends Empresa {

	private int cargaAtual;
	private int numeroMaxCarga;

	public Caminhao(String marca, String modelo, int anoFabricacao, int numeroMaxCarga) {
		super(marca, modelo, anoFabricacao);
		this.cargaAtual = 0;
		this.numeroMaxCarga = numeroMaxCarga;

	}

	public int carregarCacamba(int carga) {
		if (this.cargaAtual >= numeroMaxCarga) {
			System.out.println("O caminhao ja esta com o limite de carga em sua cacamba,impossivel inserir mais carga");
			return this.cargaAtual;

		}
		if (this.cargaAtual + carga >= numeroMaxCarga) {
			this.cargaAtual = numeroMaxCarga;
			System.out.println("O caminhao atingiu sua carga maxima, nao podendo inserir toda a carga desejada");
			return this.cargaAtual;
		}
		if (this.cargaAtual < numeroMaxCarga) {
			this.cargaAtual = this.cargaAtual + carga;
			System.out.println("A carga foi inserida com sucesso");
		}
		return this.cargaAtual;

	}

	public int esvaziarCacamba() {
		System.out.println("Transporte realizado, agora a ca�amba sera esvaziada");
		this.cargaAtual = 0;
		return this.cargaAtual;
	}

	public void RealizarTransporte() {
		if (this.estado == true && this.cargaAtual > 0) {
			System.out.println("O caminhao esta realizando o transporte");
			esvaziarCacamba();
		}
		if (this.estado == false) {
			System.out.println("O caminhao esta desligado");
		}
		if (this.estado == true && this.cargaAtual == 0) {
			System.out.println("O caminhao esta ligado porem esta sem carga");
		}
	}

	public int getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(int cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public int getNumeroMaxCarga() {
		return numeroMaxCarga;
	}

	public void setNumeroMaxCarga(int numeroMaxCarga) {
		this.numeroMaxCarga = numeroMaxCarga;
	}

	@Override
	public String toString() {
		return super.toString() + "Caminhao [cargaAtual=" + cargaAtual + ", numeroMaxCarga=" + numeroMaxCarga + "]";
	}

}
