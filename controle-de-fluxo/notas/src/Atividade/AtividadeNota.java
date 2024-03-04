package Atividade;

import java.util.Scanner;

public class AtividadeNota {
	
	public static void main(String args[]) {
		notas();
	}

	public static void notas() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("notas");
		int nota1 = 10;
		int nota2 = 6;
		int nota3 = 10;
		int nota4 = 8;
		int nota5 = 2;
		int nota6 = 1;
		int divisao = 4;
		
		int num1 = nota1 + nota2 + nota3 + nota4;
		int num2 = nota1 + nota5 + nota3 + nota6;
		int num3 = nota6 + nota5 + nota3 + nota6;
		
		int notas1 = num1 / divisao;
		System.out.println(notas1);
		
		int notas2 = num2 / divisao;
		System.out.println(nota2);
		
		int notas3 = num3 / divisao;
		System.out.println(notas3);
	
		String nota1St = getNotas(notas1);
		String nota2St = getNotas(notas2);
		String nota3St = getNotas(notas3);
		
		System.out.println(nota1St);
		System.out.println(nota2St);
		System.out.println(nota3St);
	}
	
	public static String getNotas(int notas) {
			String result;
		if (notas >= 0 && notas <= 4) {
			result = "Reprovado";
		} else if (notas >= 5 && notas <= 6) {
			result = "Recuperação";
		} else {
			result = "Aprovado";
		}
		
		return result;
	}
}
