package prova03;

public class EmpresaTeste {
	public static void main(String args[]) {
		Onibus onibus1 = new Onibus("Mercedez", "OF 1621", 2019, 40);
		onibus1.Ligar();
		onibus1.InserirPassageiros(20);
		onibus1.InserirPassageiros(30);
		System.out.println(onibus1.getNumeroPassageiros());
		onibus1.RealizarTransporte();
		onibus1.RetirarPassageiros(70);
		System.out.println(onibus1.getNumeroPassageiros());
		onibus1.RealizarTransporte();
		onibus1.RetirarPassageiros(5);
		System.out.println(onibus1.getNumeroPassageiros());
		onibus1.RealizarTransporte();
		onibus1.Desligar();
		System.out.println(onibus1);
		Caminhao caminhao1 = new Caminhao("Scania", "R450", 2020, 500);
		caminhao1.Ligar();
		caminhao1.carregarCacamba(450);
		System.out.println(caminhao1.getCargaAtual());
		caminhao1.carregarCacamba(150);
		System.out.println(caminhao1.getCargaAtual());
		caminhao1.carregarCacamba(150);
		caminhao1.RealizarTransporte();
		System.out.println(caminhao1.getCargaAtual());
		System.out.println(caminhao1);

	}

}
