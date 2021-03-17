package petle;

public class Main {
	
	public static void main(String[] args) {
		
		// Za pomoc¹ pêtli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
		// dodaj napis'du¿a liczba'
		
		int x = 1;

		while (x <= 10) {
			if (x > 5) {
				System.out.println(x + " duza liczba");
			} else {
				System.out.println(x);
			}
			x++;
		}
		
		// Napisz program który wyswietli liczby podzielne przez 3 z zakresu 14-38
		
		for (int i = 14; i <= 38; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		// Napisz program, który wypisuje liczby od n do 50 gdzie n jest
		// wartoscia podana przez usera, które s¹ nieparzyste.
		
		int n = 8;

		for (int j = 8; j <= 50; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
	}

}
