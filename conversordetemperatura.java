
import java.util.Scanner;

public class conversordetemperatura{
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			//Declaração de variáveis
			double f, c;
			int e;
			
			//Criação instância objeto de entrada
			Scanner entrada = new Scanner(System.in);

			do{
				System.out.println("\n\t\t\t -- Conversor de temperatura --\n");
	
				System.out.println("1. Celsius:");
				System.out.println("2. Fahrenheit:");
				System.out.println("3. Saida");
	
				System.out.print("Opção:");
				e = entrada.nextInt();

			
			//Apresentação]
			if (e == 1){
			System.out.println("\n\t\t\t ---Conversor de Cel para Fah ---\n");
			
			//Entrada
			System.out.println("Informe cel: ");
			c = entrada.nextInt();
			
			//Processamento
			f =  9 * c / 5 + 32;
			
			//Saída
			System.out.println("\n\n" + 9 + " * " + c + " / " + 5 + " + " + 32 + " = " + f + "\n");

			}if (e == 2){

			//Apresentação
			System.out.println("\n\t\t\t ---Conversor de Fah para Cel ---\n");
			
			//Entrada
			System.out.println("Informe fah: ");
			f = entrada.nextInt();
			
			//Processamento
			c = f * 9 / 5 + 32;
			
			//Saída
			System.out.println("\n\n" + c + " = " + f + " * " + 9 + " / " + 5 + " + " + 32 + "\n");
				}

		}while(e!= 3);

	}

}
	

