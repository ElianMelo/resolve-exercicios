/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Cálcula o total a ser pago pelas peças compradas
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.00");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
	    
	    int codigoPeca1 = leitor.nextInt();
	    int numeroPeca1 = leitor.nextInt();
	    double valorPeca1 = Double.parseDouble(leitor.next());
	    int codigoPeca2 = leitor.nextInt();
	    int numeroPeca2 = leitor.nextInt();
	    double valorPeca2 = Double.parseDouble(leitor.next());
	    double total;
	    
	    total = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);
	    
	    System.out.println("VALOR A PAGAR: R$ " + formatador.format(total));
	}

}
