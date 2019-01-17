/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Lê um valor e diz em qual intervalo ele se encontra
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1037
*/
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valor = Double.parseDouble(leitor.next());
		String texto = "";
		
		if(valor < 0 || valor > 100) {
			texto += "Fora de intervalo";
		}else if(valor >= 0 && valor <= 25) {
			texto += "Intervalo [0,25]";
		}else if(valor > 25 && valor <= 50) {
			texto += "Intervalo (25,50]";
		}else if(valor > 50 && valor <= 75) {
			texto += "Intervalo (50,75]";
		}else if(valor > 75 && valor <= 100) {
			texto += "Intervalo (75,100]";
		}
		
		System.out.println(texto);
	}

}
