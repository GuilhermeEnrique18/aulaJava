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


package aula02;
import java.util.Scanner; 
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String p1,p2,p3,p4,p5; 
		int cont = 0;
		
		System.out.println("Telefonou para a vítima? S para Sim e N para não: ");
		p1 = input.next();
		
		System.out.println("Esteve no local do crime?S para Sim e N para não: ");
		p2 = input.next();

		System.out.println("Mora perto da vítima?S para Sim e N para não: ");
		p3 = input.next();

		System.out.println("Devia para a vítima?S para Sim e N para não: ");
		p4 = input.next();

		System.out.println("Já trabalhou com a vítima?S para Sim e N para não: ");
		p5 = input.next();
		
		if (p1 == "S") {
			cont++;
		} else if(p2 == "S") {			
			cont++;
		} else if (p3 == "S") {
			cont++;
		}else if (p4 == "S") {
			cont++;
		}else if (p5 == "S") {
			cont++;
		} else if (cont == 2) {
			System.out.println("Suspeita.");
		} else if (cont > 2 && cont < 5) {
			System.out.println("Cúmplice.");
		} else if (cont == 5) {
			System.out.println("Assassino.");
		}
		else {
			System.out.println("Inocente.");
		}
	}
	


}
