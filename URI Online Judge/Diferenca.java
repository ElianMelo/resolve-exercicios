/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula a diferen�a entre os valores apresentados
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
*/
import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
	}

}
