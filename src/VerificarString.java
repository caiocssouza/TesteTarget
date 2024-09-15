import java.util.Scanner;

public class VerificarString {

	/*Escreva um programa que verifique, em uma string, 
	a existência da letra ‘a’, seja maiúscula ou minúscula,
	além de informar a quantidade de vezes em que ela ocorre. */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		String texto = entrada.next();
		String minuscula = texto.toLowerCase();
		
		System.out.println("Qual letra deseja verificar? ");
		String letra = entrada.next();
		String minuscula2 = letra.toLowerCase();
		
		if(minuscula.contains(String.valueOf(minuscula2))) {
			System.out.println("Contém a letra " + minuscula2);
		}else 
			System.out.println("Não contém a letra " + minuscula2);
	}
	
}
	
	

