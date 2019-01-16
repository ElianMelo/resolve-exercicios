/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula a diferen�a entre os valores apresentados
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a;
		int b; 
		int c;
		int d;
		int diferenca;
		
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();
		d = leitor.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
	}

}
