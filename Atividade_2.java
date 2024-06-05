package aula_7;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor_1,valor_2, soma;
		int senhaMestre, senhaTentativa; 
		
		System.out.print("Cadastre uma senha (Apenas Números): ");
		senhaMestre = ler.nextInt();
		
		System.out.print("Digite um número: ");
		valor_1 =ler.nextDouble();
		System.out.print("Digite outro número: ");
		valor_2 = ler.nextDouble();
		
		soma= (valor_1+valor_2);
		
		System.out.print("Digite sua senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();
		
		if (senhaTentativa == senhaMestre)
           System.out.println("A soma é: " +soma);
		
		if (senhaTentativa != senhaMestre)
	           System.out.println("Erro! Senha errada");

	}


	}


