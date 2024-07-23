package loops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
/*		System.out.println("Dammi il primo numero");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Dammi il secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine());*/

		// ------------------------------------------------ WHILE ------------------------------------------------
		// Nei while loop, come prima cosa viene valutata la condizione. Se questa è falsa allora si salta a piè pari il loop. Se invece è vera si entra
		// nel loop e si procede fino a che la condizione non diventa falsa.

/*		while (num2 <= num1 + 20) {
			num2 += 4;
			System.out.println(num2); // 38
		}

		System.out.println(num1);
		System.out.println(num2);*/

		int sum = 0;
		int num;
		// Devo chiedere un numero all'utente fino a che non inserisce lo zero
/*		while (true) {
			System.out.println("Inserisci il numero da sommare");
			num = Integer.parseInt(scanner.nextLine());
			if (num == 0) break;
			sum += num;
		}

		System.out.println("La somma dei numeri inseriti è: " + sum);*/


		// ------------------------------------------------ DO-WHILE ------------------------------------------------
		// Nei do-while loop, la condizione viene valutata solo dopo aver eseguito il codice tra le graffe. Ciò significa che anche se la condizione
		// dovesse essere falsa il codice almeno una volta verrà eseguito

		int num2;
		int sum2 = 0;
		do {
			System.out.println("Inserisci il numero da sommare");
			num2 = Integer.parseInt(scanner.nextLine());
			sum2 += num2;

		} while (num2 != 0);

		System.out.println("La somma dei numeri inseriti è: " + sum2);


	}
}
