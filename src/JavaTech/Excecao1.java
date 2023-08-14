package JavaTech;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício de aula sobre exception
		
		String frase = null, novaFrase = null;
		
		//frase = "olá meus amigos!";
				
		try {
			novaFrase = frase.toUpperCase();
		} 
		catch (NullPointerException e) { // captura da possivel exceção
			System.out.println("\nA frase inicial está nula, para solucionar foi atribuido um valor padrão");
			
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nAntiga frase: " + frase);
		System.out.println("\nNova frase: " + novaFrase);
	}

}
