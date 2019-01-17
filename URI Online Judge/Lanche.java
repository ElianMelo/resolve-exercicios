/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Mostra o preço total de uma compra baseada no código e na quantidade comprada
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Lanche {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols formatadorSimbolo = formatador.getDecimalFormatSymbols();
		formatadorSimbolo.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(formatadorSimbolo);
		
		int codigo = leitor.nextInt();
		int quantidade = leitor.nextInt();
		float preco = 0;
		float total;
		
		if(codigo == 1) {
			preco = 4f;
		}else if(codigo == 2) {
			preco = 4.5f;
		}else if(codigo == 3) {
			preco = 5f;
		}else if(codigo == 4) {
			preco = 2f;
		}else if(codigo == 5) {
			preco = 1.5f;
		}
		
		total = quantidade * preco;
		
		System.out.println("Total: R$ " + formatador.format(total));
	}

}
