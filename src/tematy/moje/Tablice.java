package tematy.moje;

import java.util.Scanner;

public class Tablice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) Napisz program ktory dla danej tablicy intow oblicza sume tej tablicy
		
		int tab[] = new int[10];
		int suma = 0;
		for (int i = 0; i < tab.length; i++) {
			suma += tab[i];
		}
		
		/* 2) Napisz program, ktory dal danej tablicy intow dlugosci 3 wyswietli tablice 2x dluzsza wypelniona wartoscia 0 poza ostatnim elementem,
		 *  ostatni element tablicy ma miec wartosc odpowiadajaca dlugosci tablicy
		 */
		
		int tab1[] = { 6, 8, 3 };
		int tab2[] = new int[2 * tab1.length];
		// przypisanie dlugosci tablicy do ostatniego elementu
		tab2[tab2.length - 1] = tab2.length;

		// wyswietlenie tab2
		for (int a = 0; a < tab2.length; a++) {
			System.out.print(tab2[a] + " ");
		}
		
		
		// 3) Napisz  program ktory dla danej tablicy intow zwraca sume elementow po lewej od zadanego indeksu.
		
		int tab3[] = {5,1,3,2,6};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Program zwraca sume elementów tablicy po lewej od zadanego indeksu.");
		System.out.println("Podaj indeks od 0 do 4");
		
		int index = scanner.nextInt(), suma1 = 0;
		
		for (int b = 0; b<index; b++)
		{
			suma1+=tab3[b];
		}
		
		System.out.println("Suma = " + suma1);

		/* 4) Zadeklaruj tablice stringow dlugosci 4, dodaj do niej 4 wyrazy.
		 * w petli przypisz kazdy wyraz do wczesniej utworzonej zmiennej typu String. Wyswietl ta zmienna.
		 */
		
		// To juz bylo wczesniej
		
		// 5 tez bylo
		

	}

}
