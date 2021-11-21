package maio;

public class VetorJava {

	public static void main(String[] args) {
		String [] carro={"Fiesta","Gol","Astra","Fusion"};
		
		System.out.println(carro[0]);
		System.out.println(carro[1]);
		System.out.println(carro[2]);
		System.out.println(carro[3]);
		
		
		carro [0]= "Ford Ka";
		carro [3]= " Classic";
		
		System.out.println(carro[0]);
		System.out.println(carro[3]);
		
		System.out.println("A quantidade de daddos que existe no meu vetor são:"+carro.length);
		
		for (int i=0;i<carro.length;i++) {
			System.out.println(carro[i]);	
		}

	}

}
