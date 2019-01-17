/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Divide um valor em reais em cédulas de 100, 50, 20, 10, 5, 2 e 1
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1018
*/
import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int valor = leitor.nextInt();
		int auxiliarValor = valor;
		int cedula100 = 0;
		int cedula50 = 0;
		int cedula20 = 0;
		int cedula10 = 0;
		int cedula5 = 0;
		int cedula2 = 0;
		int cedula1 = 0;
		
		while(valor != 0){
			if(valor >= 100) {
				valor -= 100;
				cedula100++;
			}else if(valor >= 50) {
				valor -= 50;
				cedula50++;
			}else if(valor >= 20) {
				valor -= 20;
				cedula20++;
			}else if(valor >= 10) {
				valor -= 10;
				cedula10++;
			}else if(valor >= 5) {
				valor -= 5;
				cedula5++;
			}else if(valor >= 2) {
				valor -= 2;
				cedula2++;
			}else {
				valor--;
				cedula1++;
			}
		}
		
		System.out.println(auxiliarValor + "\n"
				+ cedula100 + " nota(s) de R$ 100,00\n"
				+ cedula50 + " nota(s) de R$ 50,00\n"
				+ cedula20 + " nota(s) de R$ 20,00\n"
				+ cedula10 + " nota(s) de R$ 10,00\n"
				+ cedula5 + " nota(s) de R$ 5,00\n"
				+ cedula2 + " nota(s) de R$ 2,00\n"
				+ cedula1 + " nota(s) de R$ 1,00");
	}

}
