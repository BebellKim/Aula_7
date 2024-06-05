package aula_7;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		double valor;

		System.out.print("Informe um valor: ");     //ENTRADA
		valor = ler.nextDouble();

		if (valor % 5 == 0) {      //PROCESSAMENTO
			System.out.println("O número " + valor + " é multiplo de  5");     //SAÍDA

         }
		if   (valor % 5 != 0) {	        //PROCESSAMENTO
			System.out.println("O número " +valor + " não é multiplo de 5");   //SAÍDA
		}

			ler.close();
	}

}
