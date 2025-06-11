package aula01;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double respReal = entrada.nextDouble();
		System.out.println(respReal);
		
		System.out.println("Digite um número inteiro: ");
		int respInteiro = entrada.nextInt();
		System.out.println(respInteiro);
	}

}