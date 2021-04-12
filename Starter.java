package model;

import java.util.Scanner;

public class Starter {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Entrer a");
int a = input.nextInt();
System.out.println("Entrer b");
int b = input.nextInt();
System.out.println("Entrer c");
int c = input.nextInt();

if (a > 0 && b > 0 && c > 0) {

if (a == b && a != c || a == c && a != b || b == c && b != a) {

System.out.println("Le triangle est isocèle");
}

else if (a == b && a == c) {
System.out.println("Le triangle est équilatéral");

}

else {
System.out.println("Le triangle est scalène");
}

}
else {
System.out.println("Vous avez rentré un nombre négatif");
}
input.close();

}
}