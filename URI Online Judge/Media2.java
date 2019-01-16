/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula a m�dia ponderada de tr�s notas de um aluno
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.0");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
		
		Double a = Double.parseDouble(leitor.next());
		Double b = Double.parseDouble(leitor.next());
		Double c = Double.parseDouble(leitor.next());
		Double media;
		
		media = (a * 2 + b * 3 + c * 5) / 10;
		
		System.out.println("MEDIA = " + formatador.format(media));
		
	}
	
}
