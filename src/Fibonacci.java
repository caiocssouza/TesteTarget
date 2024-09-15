import java.util.Scanner;
/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. */
public class Fibonacci {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("Qual o número de posições da sequencia fibonacci?");
		int maximo = entrada.nextInt();
		
		for (int i = 0; i < maximo; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	//não consegui fazer a verificação
	}
	
}
