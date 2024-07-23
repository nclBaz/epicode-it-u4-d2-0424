package conditionals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ----------------------------------------------------- IF-ELSE --------------------------------------------------
		// if ("") System.out.println("La stringa è vuota"); <-- Non siamo in JS quindi non esiste il concetto di truthy & falsy (stringa vuota sarebbe falsy in JS)
		if ("".isEmpty()) System.out.println("La stringa è vuota");

		int x = 1, y = 2, z = 3;

		if (x > y) System.out.println("X è maggiore di Y");
		else System.out.println("X è minore o uguale a Y");

		if (!(x > y)) System.out.println("X non è maggiore di Y");
		else System.out.println("X non è maggiore di Y");

		if (x > y) System.out.println("X è maggiore di Y");
		else if (x == y) System.out.println("X è uguale a Y");
		else System.out.println("X è minore di Y");

		// ----------------------------------------------------- TERNARY --------------------------------------------------
		String testo = x > y ? "X è maggiore di Y" : "X è minore o uguale a Y";
		System.out.println(testo);

		int a = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(a);

		// ----------------------------------------------------- SWITCH-CASE --------------------------------------------------

		Scanner scanner = new Scanner(System.in);
/*
		System.out.println("Dammi il primo numero");
		int num1 = Integer.parseInt(scanner.nextLine());*/

/*		switch (num1) {
			default:
				System.out.println("Il numero non è nessuno dei precedenti");
				break;
			case 1:
				System.out.println("Il numero inserito è 1");
				break;
			case 2:
				System.out.println("Il numero inserito è 2");
				break;
			case 3:
				System.out.println("Il numero inserito è 3");
				break;
			case 4:
				System.out.println("Il numero inserito è 4");
				break;
		}*/
/*		System.out.println("Dammi il secondo numero");
		int num2 = Integer.parseInt(scanner.nextLine());


		int num3 = num1 > num2 ? num1 : num2;

		switch (num3) {
			case 10: {
				System.out.println("è 10");
				num1++;
			}

			case 100: {
				System.out.println("è 100");
				num1--;
				break;
			}
			case 1000: {
				System.out.println("è 1000");
				num1++;
			}
			default:
				System.out.println("Nessuno dei precedenti");
				num1--;
				break;
		}

		System.out.println("num1 è: " + ++num1); // 1000
		System.out.println("num1 è: " + num1); // 1000*/


		System.out.println("Inserisci un numero da 1 a 7");
		int num = Integer.parseInt(scanner.nextLine());

		String giornoInLettere = switch (num) {
			case 1 -> "Lun";
			case 2 -> "Mar";
			case 3 -> "Mer";
			case 4 -> "Gio";
			case 5 -> "Ven";
			case 6 -> "Sab";
			case 7 -> "Dom";
			default -> "Dovevi inserire un numero da 1 a 7";
		};

		System.out.println("Il giorno inserito é: " + giornoInLettere);

		scanner.close();


	}
}