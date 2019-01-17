/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 17/01/2019
Objetivo sucinto do programa: Calcula a soma dos impares consecutivos baseado em um in�cio e uma quantidade de impares
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158
*/
import java.util.Scanner;

public class SomaDeImparesConsecutivos3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int quantidade = leitor.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			int x = leitor.nextInt();
			int y = leitor.nextInt();
			int total = 0;
			int contador = 0;
			
			for(int j = x; true ; j++) {
				if(j % 2 != 0) {
					total += j;
					contador++;
				}
				if(contador == y) {
					break;
				}
			}
			
			System.out.println(total);
		}

	}

}
