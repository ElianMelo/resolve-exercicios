/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula a quantidade de anos, meses e dias baseado na quantidade de dias passada
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1020
*/
import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int dias = leitor.nextInt();
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		while(dias != 0){
			if(dias >= 365){
				dias -= 365;
				ano++;
			}else if(dias >= 30){
				dias -= 30;
				mes++;
			}else{
				dias -= 1;
				dia++;
			}
		}
		
		System.out.println(ano + " ano(s)\n"
				+ mes + " mes(es)\n"
				+ dia + " dia(s)");
	}

}
