

import java.util.Scanner;

public class MediaDoAtleta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o nome do atleta ");
		input.nextLine();
		String nomeatleta = input.nextLine(); 
		
		
		if(nomeatleta.equals("")) {
			System.out.println("Programa Finalizado!!");
			System.exit(0);
		}
		
		System.out.println("Insira os valores das distancias dos saltos em metros: ");
		System.out.println("Primeiro Salto:");
		float jump1 = input.nextFloat();
		System.out.println("Segundo Salto:");
		float jump2 = input.nextFloat();
		System.out.println("Terceiro Salto:");
		float jump3 = input.nextFloat();
		System.out.println("Quarto Salto:");
		float jump4 = input.nextFloat();
		System.out.println("Quinto Salto:");
		float jump5 = input.nextFloat();
		input.close();
		
		float media = jump1 + jump2 + jump3 + jump4 + jump5 /5;
		
		System.out.println("Atleta:" + nomeatleta);
		System.out.println("\n"); 
		
		System.out.println("Primeiro salto:" + jump1);
		System.out.println("Segundo salto:" + jump2);
		System.out.println("Terceiro salto:" + jump3);
		System.out.println("Quarto salto:" + jump4);
		System.out.println("Quinto salto:" + jump5);
		System.out.println("\n\n"); 
		
		System.out.println("RESULTADO FINAL:");
		System.out.println("Atleta:" + nomeatleta);
		System.out.println("Media dos saltos:\n" + media);
		

	}
}
