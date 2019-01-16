/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula o sal�rio de um funcion�rio baseado na sua comiss�o
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class SalarioComBonus {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.00");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
		
		String nome = leitor.next();
		Double salarioFixo = Double.parseDouble(leitor.next());
		Double totalDeVendas = Double.parseDouble(leitor.next());
		Double comissao;
		Double total;
		
		comissao = totalDeVendas * 0.15;
		total = comissao + salarioFixo;
		
		System.out.println("TOTAL = R$ " + formatador.format(total));
	}

}
