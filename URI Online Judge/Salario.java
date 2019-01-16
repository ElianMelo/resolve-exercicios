/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Mostra o salário do funcionário
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Salario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	    DecimalFormat formatador = new DecimalFormat("#####0.00");
	    DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
	    simboloFormatador.setDecimalSeparator('.');
	    formatador.setDecimalFormatSymbols(simboloFormatador);
		
		int numero;
		int horasTrabalhadas;
		double valorPorHora;
		double salario;
		
		numero = leitor.nextInt();
		horasTrabalhadas = leitor.nextInt();
		valorPorHora = Double.parseDouble(leitor.next());
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + formatador.format(salario));
	}

}