package aula01;
import java.util.Scanner;






public class Desafio01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber se é positivo ou negativo");
		int valor = entrada.nextInt();
		
		System.out.println(valor == 0 ? "É 0" : valor < 0 ? "O número é negativo!" : "O numero é positivo");
		
	}

}
