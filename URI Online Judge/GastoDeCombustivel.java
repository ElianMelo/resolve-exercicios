/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Cálcula e mostra a quantidade de litros de combustível gastos em uma viagem
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.000");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
	    
	    int tempoViagem = leitor.nextInt();
	    int velocidadeMedia = leitor.nextInt();
	    double distanciaPercorrida;
	    double quantidadeLitros;
	    
	    distanciaPercorrida = tempoViagem * velocidadeMedia;
	    
	    quantidadeLitros = distanciaPercorrida / 12;
	    
	    System.out.println(formatador.format(quantidadeLitros));
	}

}
