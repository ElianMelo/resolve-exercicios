/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Aceita ou recusa valores baseado em uma f�rmula
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1035
*/
import java.util.Scanner;

public class TesteDeSele��o1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();

		if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
	}

}
