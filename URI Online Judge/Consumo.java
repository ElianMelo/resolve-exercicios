/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: C�lcula o consumo m�dio de um autom�vel
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1014
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.000");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
	    
	    int distanciaTotal = leitor.nextInt();
	    float combustivelGasto = Float.parseFloat(leitor.next());
	    float consumo;
	    
	    consumo = distanciaTotal / combustivelGasto;
	    
	    System.out.println(formatador.format(consumo) + " km/l");
	    
	}

}
