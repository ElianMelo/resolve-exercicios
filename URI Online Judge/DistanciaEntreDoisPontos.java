/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Cálcula a distância entre dois pontos em um plano cartesiano
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1015
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.0000");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
	    
	    float x1 = Float.parseFloat(leitor.next());
	    float y1 = Float.parseFloat(leitor.next());
	    float x2 = Float.parseFloat(leitor.next());
	    float y2 = Float.parseFloat(leitor.next());
	    double distancia;
	    
	    // Soma o quadrado de x2 - x1 e y2 - y1 e depois faz sua raiz quadrada
	    distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    
	    System.out.println(formatador.format(distancia));
	}

}
