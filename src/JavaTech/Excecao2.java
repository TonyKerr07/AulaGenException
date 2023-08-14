package JavaTech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício de aula sobre exception 2 - quando ocorre uma divisão por zero
		
		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		do {
			try {
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				int resultado = quociente (numerador, denominador);
			
				System.out.printf("\nResultado: %d / %d = %d", numerador, denominador, resultado);
				continueLoop = false;
			} 
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nExceção: %s", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro."
						+ "\nTente novamente!");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nExceção: %s", arithmeticException);
				System.out.println("\nZero é um denominador inválido!"
						+ "\nTente novamente!");
			}
			
		} while (continueLoop);

	}

}
