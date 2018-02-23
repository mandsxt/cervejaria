import java.util.Scanner;

public class Bar {
	
	public static void main(String[] args) {
		
		int cervejas = 99;
		int opcao = 0;
		int quantidade = 0;
		Scanner leitor = new Scanner(System.in);
		
		while (cervejas > 0){
			System.out.println(cervejas + " Cervejas no freezer");
			System.out.println("Pego uma garrafa e passo");
			cervejas = cervejas - 1;
			System.out.println("Agora são " + cervejas + " no freezer");
			
			if (cervejas == 1){
				System.out.println("Acabou as cervejas, você gostaria de mais?");
				System.out.println("Digite 1 caso queira mais");
				System.out.println("Digite 2, caso não queira mais");
				opcao = leitor.nextInt();
				
				if (opcao == 1);{
					System.out.println("Informe o numero de cervejas");
					quantidade = leitor.nextInt();
					
					cervejas = quantidade;
					System.out.println("Cervejas reabastecidas");
					
				}
				
			}
		}
		
	}
}
