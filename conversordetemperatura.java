
import java.util.Scanner;

public class conversordetemperatura {
	public class Conversor {
		public static void main(String[] args) {
			//Declaração de variáveis
			double cel, fah;
			
			//Criação instância objeto de entrada
			Scanner entrada = new Scanner(System.in);
			
			//Apresentação
			System.out.println("\n\t\t\t ---Conversor de Cel para Fah ---\n");
			
			//Entrada
			System.out.println("Informe cel: ");
			cel = entrada.nextDouble();
			
			//Processamento
			fah =  9 * cel / 5 + 32;
			
			//Saída
			System.out.println("\n\n" + 9 + " * " + cel + " / " + 5 + " + " + 32 + " = " + fah + "\n");
			

		}
		
	}
}