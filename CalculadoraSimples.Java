import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("escolha uma opcão de operação ");
		System.out.println("1 para SOMA ");
		System.out.println("2 para MULTIPLICAR ");
		System.out.println("3 para SUBTRAIR ");
		System.out.println("4 para DIVIDIR");
		Integer escolha = input.nextInt();
		
		System.out.println("Insira um numero para calcular: ");
		double num1 = input.nextDouble();
		System.out.println("Insira outro numero: ");
		double num2 = input.nextDouble();
		input.close();
		
		double resultado=0;
		
		switch (escolha){
				
		case 1:
			
			 resultado= num1+num2;
			System.out.println("Resultado :" + resultado);
			break;
		case 2:
			
			 resultado= num1*num2;
			System.out.println("Resultado :" + resultado);	
			break;
		case 3:
			
			 resultado= num1-num2;
			System.out.println("Resultado :" + resultado);
			break;
		case 4:
			
			 resultado= num1/num2;
			System.out.println("Resultado :" + resultado);	
			break;
				
		}
		
		
		
		
	}
}
