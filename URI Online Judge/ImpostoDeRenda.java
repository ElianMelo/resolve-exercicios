/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Calcula o imposto de renda de um país
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1051
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols formatadorSimbolo = formatador.getDecimalFormatSymbols();
		formatadorSimbolo.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(formatadorSimbolo);
		
		float renda = Float.parseFloat(leitor.next());
		float total = 0;
		
		if(renda >= 0.00 && renda <= 2000.00) {
			System.out.println("Isento");
		}else if(renda >= 2000.01 && renda <= 3000.00) {
			total = renda - 2000;
			total = (total *  8 / 100);
		}else if(renda >= 3000.01 && renda <= 4500.00) {
			total = renda - 3000;
			total = (total *  18 / 100) + (1000 * 8 / 100);
		}else if(renda > 4500.00) {
			total = renda - 4500;
			total = (total *  28 / 100) + (1500 *  18 / 100) + (1000 * 8 / 100);
		}
		
		if(renda >= 0.00 && renda <= 2000.00) {
		}else {
			System.out.println("R$ " + formatador.format(total));
		}
		
	}

}
