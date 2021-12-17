package prova03;

public abstract class Empresa {

	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected boolean estado;

	public Empresa(String marca, String modelo, int anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.estado = false;
	}

	public void Ligar() {
		System.out.println("O veiculo foi ligado");
		this.estado = true;

	}

	public void Desligar() {
		System.out.println("O veiculo foi desligado");
		this.estado = false;
	}

	public abstract void RealizarTransporte();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Empresa [marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", estado="
				+ estado + "]";
	}

}
