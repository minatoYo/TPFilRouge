package starter;

import java.util.Scanner;

import Model.Triangle;

public class Principale {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Choisissez trois longueurs des cot�s du triangle");
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

			case "Triangle �quilat�ral": {

				System.out.println(triangle.Compare());
				break;
			}

			case "Triangle scal�ne": {

				System.out.println(triangle.Compare());
				break;
			}
			case "Triangle isoc�le": {

				System.out.println(triangle.Compare());
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + triangle.Compare());

			}

		}

		else {
			System.out.println(" ");
			System.out.println("Erreur! Vous avez entr� un ou plusieurs nombre(s) n�gatif(s)");
			System.out.println(" ");
			System.out.println("Veuillez entrer des nombres positifs ");

		}

	}

}
