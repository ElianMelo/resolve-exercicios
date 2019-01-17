/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Determina em qual quadrante o ponto está
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1041
*/
import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double x = Double.parseDouble(leitor.next());
		double y = Double.parseDouble(leitor.next());
		String resposta = "";
		
		if(x == 0 && y == 0) {
			resposta += "Origem";
		}else if(x == 0) {
			resposta += "Eixo Y";
		}else if(y == 0) {
			resposta += "Eixo X";
		}else if(x > 0 && y > 0) {
			resposta += "Q1";
		}else if(x < 0 && y > 0) {
			resposta += "Q2";
		}else if(x > 0 && y < 0) {
			resposta += "Q4";
		}else if(x < 0 && y < 0) {
			resposta += "Q3";
		}
		
		System.out.println(resposta);
	}

}
