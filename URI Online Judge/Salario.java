/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 15/01/2019
Objetivo sucinto do programa: Mostra o sal�rio do funcion�rio
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    DecimalFormat df = new DecimalFormat("#####0.00");
	    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();

	    dfs.setDecimalSeparator('.');
	    df.setDecimalFormatSymbols(dfs);
		
		int numero;
		int horasTrabalhadas;
		String strValorPorHora;
		double valorPorHora;
		double salario;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		strValorPorHora = sc.next();
		
		valorPorHora = Double.parseDouble(strValorPorHora);
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.println("SALARY = U$ " + df.format(salario));
	}

}