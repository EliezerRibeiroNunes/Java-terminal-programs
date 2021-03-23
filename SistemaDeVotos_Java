


import java.util.Scanner;

public class SistemaDeVotos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int repeticao=1;
		int MarcosAndrade=0;
		int CarlosMarcelo=0;
		int FernandaJosefina=0;
		int ValdineiaPereira=0;
		int VotoNulo=0;
		int VotoEmBranco=0;
		int TotalVotos=0;
		
		while (repeticao !=0 ){
			System.out.println("TABELA DE VOTOS:\n");
			System.out.println("1 - Marcos Andrade");
			System.out.println("2 - Carlos Marcelo");
			System.out.println("3 - Fernanda Josefina");
			System.out.println("4 - Valdineia Pereira");
			System.out.println("5 - Voto nulo");
			System.out.println("6 - Voto em branco");
			System.out.println("==Digite 0 para finalizar a votação==");
			int escolhevoto= input.nextInt(); 
		
			switch (escolhevoto) {
		
			case 1:
				System.out.println("\nVocê votou no Marcos Andrade!\n");
				MarcosAndrade=MarcosAndrade+1;
				TotalVotos=TotalVotos+1;
				break;
			case 2:
				System.out.println("\nVocê votou no Carlos Marcelo!\n");
				CarlosMarcelo=CarlosMarcelo+1;
				TotalVotos=TotalVotos+1;
				break;
			case 3:
				System.out.println("\nVocê votou na Fernanda Josefina!\n");
				FernandaJosefina=FernandaJosefina+1;
				TotalVotos=TotalVotos+1;
				break;
			case 4:
				System.out.println("\nVocê votou na Valdineia Pereira!\n");
				ValdineiaPereira=ValdineiaPereira+1;
				TotalVotos=TotalVotos+1;
				break;
			case 5:
				System.out.println("\nVocê votou NULO!\n");
				VotoNulo=VotoNulo+1;
				TotalVotos=TotalVotos+1;
				break;
			case 6:
				System.out.println("\nVocê votou em branco!\n");
				VotoEmBranco=VotoEmBranco+1;
				TotalVotos=TotalVotos+1;
				break;
			}//fimCase
			
			if(escolhevoto > 6) {
				System.out.println("\n!!!!!!!!Insira uma informação valida!!!!!!!!\n");
			}//fimIF_erro
			
			repeticao=repeticao++;
		
			if(escolhevoto == 0) {
				System.out.println("\n==================================== VOTAÇÂO FINALIZADA COM SUCESSO!! ================================");
				repeticao=0;
			}//fimIF
			
		}//fimWhile
		
		System.out.println("\n");
		System.out.println("<><><><> RESULTADO DOS VOTOS <><><><>");
		System.out.println("\n");
		System.out.println("Votos no total: " + TotalVotos +" votos");
		System.out.println("Marcos Andrade: " + MarcosAndrade +" votos");
		System.out.println("Carlos Marcelo: " + CarlosMarcelo +" votos");
		System.out.println("Fernanda Josefina: " + FernandaJosefina +" votos");
		System.out.println("Valdineia Pereira: " + ValdineiaPereira +" votos");
		System.out.println("Votos nulos: "+ VotoNulo +" votos");
		System.out.println("Votos em branco: " + VotoEmBranco +" votos");
		System.out.println("\n\n");
		
		System.out.println("O percentual de votos nulos sobre o total é: " + VotoNulo*TotalVotos/100 +" %");
		System.out.println("O percentual de votos em branco sobre o total é: " + VotoEmBranco*TotalVotos/100 +" %");
		
		input.close();
		
	}//fimStatic
}//fimClass
