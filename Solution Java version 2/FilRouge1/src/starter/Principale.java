package starter;

import java.util.Scanner;

import Model.Triangle;

public class Principale {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Choisissez trois longueurs des cotés du triangle");
		System.out.println();
		int a, b, c;

		a = input.nextInt();
		System.out.println();
		b = input.nextInt();
		System.out.println();
		c = input.nextInt();

		if (a > 0 & b > 0 & c > 0) {

			Triangle triangle = new Triangle(a, b, c);

			switch (triangle.Compare()) {

			case "Triangle équilatéral": {

				System.out.println(triangle.Compare());
				break;
			}

			case "Triangle scalène": {

				System.out.println(triangle.Compare());
				break;
			}
			case "Triangle isocèle": {

				System.out.println(triangle.Compare());
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + triangle.Compare());

			}

		}

		else {
			System.out.println(" ");
			System.out.println("Erreur! Vous avez entré un ou plusieurs nombre(s) négatif(s)");
			System.out.println(" ");
			System.out.println("Veuillez entrer des nombres positifs ");

		}

	}

}
