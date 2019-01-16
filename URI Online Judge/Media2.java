/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 15/01/2019
Objetivo sucinto do programa: Calcula a média ponderada de três notas de um aluno
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Media2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    DecimalFormat df = new DecimalFormat("#####0.0");
	    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
	    
	    dfs.setDecimalSeparator('.');
	    df.setDecimalFormatSymbols(dfs);
		
		Double a;
		String strA = sc.next();
		Double b;
		String strB = sc.next();
		Double c;
		String strC = sc.next();
		Double media;
		
		a = Double.parseDouble(strA);
		b = Double.parseDouble(strB);
		c = Double.parseDouble(strC);
		
		media = (a * 2 + b * 3 + c * 5) / 10;
		
		System.out.println("MEDIA = " + df.format(media));
		
	}
	
}
