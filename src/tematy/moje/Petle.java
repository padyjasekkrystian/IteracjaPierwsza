package tematy.moje;

import java.util.Scanner;

public class Petle {

	public static void main(String[] args) {
		

		// 1) Napisz program, który oblicza potêgê 2^n, gdzie liczbê naturaln¹ n podaje uzytkownik.

		System.out.println("Program obliczaj¹cy 2 do potegi n.");
		// utworzenie obiektu typu scanner
	//	Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj n (liczba naturalna): ");
		int n = 10;

		// dodany (int) bo pokazywalo 1024.0
		System.out.println("Wynik dzia³ania 2 do potegi " + n + " wynosi: " + (int) Math.pow(2, n));

		// zrobione petla bo pewnie o to chodzilo ;)
		int wykladnik = n, wynik = 1;

		while (wykladnik > 0) {
			wynik *= 2;
			wykladnik--;
		}
		System.out.println("Wynik dzia³ania 2 do potegi " + n + " wynosi: " + wynik);

		
		// 2) Napisz program drukujacy na ekranie prostokat z literek X. Wysokosc i szerokosc wczytujemy z klawiatury
		
		System.out.println("Podaj kolejno szerokosc i wysokosc prostokata: ");
		int szerokosc = 10, wysokosc = 6;

		for (int i = 0; i < wysokosc; i++) {
			for (int j = 0; j < szerokosc; j++) {
				if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// 3) Napsiz program, który oblicza œredni¹ arytmetyczn¹ liczb naturalnych od 5 do liczby podanej przez uzytkownika. Wypisac obliczon¹ œredni¹ na konsoli.
		
		
		System.out.println("Program wyswietla srednia arytmetyczna liczb naturalnych od 5 do x.");
		System.out.println("Podaj liczbê x: ");
		int x = 9, suma = 0;

		for (int y = 5; y <= x; y++) {
			suma += y;
		}

		System.out.println("Srednia arytmetyczna liczb wynosi: " + (suma/(x-4)));
		
		
		// 4) Napisz program, który sumuje liczby z zakresu 1-40 ale tylko te które s¹ podzielne przez 3
		
		int suma2 = 0;
		for (int a = 1; a <= 40; a++) {
			if(a%3 == 0) {
				suma2 += a;
			}
		}
		
		System.out.println("Suma liczb z zakresu 1-40 podzielnych przez 3 wynosi: " + suma2);
		
		
		// 5) Zadeklaruj tablice intow o dlugosci 5 i wypelnij ja dowolnymi liczbami. Wyswietl cala tablice w petli for lub while
		
		int tab[] = { 5, 3, 8, 2, 0 };

		for (int b = 0; b < tab.length; b++) {
			System.out.print(tab[b] + " ");
		}
		System.out.println();
		
		/*
		 *  6) Zadeklaruj tablice stringow dlugosci 4 dodaj do niej 4 wyrazy. 
		 *  W petli przypisz kazdy wyraz do wczesniej utworzonej zmiennej typu string.
		 *   Wyswietl zmienna
		 */
		
		String tablica[] = new String[4];
		tablica[0] = "Ala";
		tablica[1] = "nie";
		tablica[2] = "ma";
		tablica[3] = "kota";

		String zmienna = "";
		//przypisanie elementow tablicy do zmienna
		for (int c = 0; c < 4; c++) {
			zmienna += tablica[c] + " ";
		}

		System.out.println(zmienna);
		
		/* 7) Zadeklaruj dwie tablice intow roznej dlugosci. Przypisz obu na ideksie 0 jakas liczbe.
		 * Wyswietl te tablice ktora jest dluzsza
		 */
		
		int tab1[] = new int[5];
		int tab2[] = new int[3];
		int dluzsza[];

		tab1[0] = 7;
		tab2[0] = 9;
		//sprawdzanie dlugosci tablic
		if (tab1.length > tab2.length) {
			dluzsza = tab1;
		} else {
			dluzsza = tab2;
		}

		for (int i = 0; i < dluzsza.length; i++) {
			System.out.print(dluzsza[i] + " ");
		}

	}

}
