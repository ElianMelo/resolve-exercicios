/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: C�lcula o tempo para um carro se aproximar de outro
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1016
*/
import java.util.Scanner;

public class Distancia {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int distancia = leitor.nextInt();
		
		System.out.println(distancia * 2 + " minutos");
	}
	
}
