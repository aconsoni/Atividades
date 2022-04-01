
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
		
		carro1.ano = 123;
		carro1.setMarca("Ford");
		carro1.setModelo("Fiesta");
		carro1.setQuatroPortas(true);
		carro1.imprimirDados();
		carro1.Buzina();
		
		System.out.println();
		System.out.println();
		
		
		Moto moto1 = new Moto();
		
		moto1.setAno(2022);
		moto1.setMarca("Honda");
		moto1.setModelo("Titan");
		moto1.imprimirDados();
		moto1.empinar();
		moto1.Buzina();
		
		
		
		System.out.println();
		System.out.println();
		
		
		Caminhao cami1 = new Caminhao();
		
		cami1.setAno(2019);
		cami1.setMarca("Scania");
		cami1.setModelo("V8");
		cami1.imprimirDados();
		cami1.Buzina();
	}

}
