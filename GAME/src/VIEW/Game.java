package VIEW;

import java.util.Scanner;

import MODEL.Calcular;

public class Game {

	
	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();
	}

	public static void jogar() {
		System.out.println("informe qual nivel de dificuldade voce deseja? [1,2,3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();

		Game.calc = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte operacao: ");

		// somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Voce tem" + Game.pontos + " ponto(s).");

			}
		}

		// subtrair
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.subtrair(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Voce tem" + Game.pontos + " ponto(s).");

			}
		}

		// multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.multiplicar(resposta)) {
				// Ganha 1 ponto
				Game.pontos += 1;
				System.out.println(" Voce tem " + Game.pontos + " ponto(s). ");
			}
		}
			// dividir
			if (calc.getOperacao() == 3) {
				System.out.println(calc.getValor1() + " / " + calc.getValor2());
				int resposta =Game.teclado.nextInt();

				if (calc.dividir(resposta)) {
					// Ganha 1 ponto
					Game.pontos += 1;
					System.out.println("Voce tem" + Game.pontos + " ponto(s).");

				}	
				
		}else  {
			System.out.println(" A operacao " + calc.getOperacao() + " nao e reconhecida ");
		}
		
		System.out.println(" Deseja continuar? [1- sim / - 0 nao] ");
		int continuar = Game.teclado.nextInt();
		
		if(continuar ==1) {
			Game.jogar();
		}else {
			System.out.println(" Voce fez " + Game.pontos + " ponto(s) ");
			System.out.println(" Volte sempre! ");
			System.exit(0);
		}
			
	}
}
