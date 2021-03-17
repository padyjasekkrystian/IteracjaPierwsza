package zmienne;

public class Main {

	public static void main(String[] args) {

		// ctrl + shift + f - autojustowanie kodu
		// syso + ctrl + spacja - skrót na syso

		// println przechodzi do kolejnego wiersza
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");

		// print nie przechodzi do kolejnego wiersza
		System.out.print("Hello world");
		System.out.print("Hello world");
		System.out.print("Hello world");
		System.out.println();

		// znaki specjalne

		// \n znak przejscia do nowej linii
		System.out.println("ala\nma psa");

		// \t znak tabulacji
		System.out.println("ala\tma psa");

		// to jest komentarz wierszowy

		/*
		 * to jest komentarz blokowy blabla ¹¿¿ææ¹œ
		 */

		// wyswietl pare napisow na konsoli, wykorzystaj skrot na syso oraz znaki
		// specjalne

		System.out.println("sdadas");
		System.out.println("dsa\nfdd");
		System.out.println("dsa\tfdd");
		System.out.println();

		// zmienne
		// typZmiennej nazwaZmiennej = wartosc;

		// String - zmienna przechowujaca litera³ lancuchowy, ciag znakow, po prostu
		// jakis napis
		String napis = "Ala ma kota";
		System.out.println(napis);

		// to nie jest deklaracja nowej zmiennej, tylko nadpisanie juz istniejacej
		napis = "pies ma Ale";
		System.out.println(napis);

		// int - liczba ca³kowita
		int liczbaCalkowita = 5;
		System.out.println(liczbaCalkowita);

		// double - liczba rzeczywista
		double liczbaRzeczywista = 5.34;
		System.out.println(liczbaRzeczywista);

		// char - znak
		char znak = '#';
		System.out.println(znak);

		// boolean - prawda/fa³sz
		boolean wartosc = true;
		System.out.println(wartosc);

		wartosc = false;
		System.out.println(wartosc);

		// Zadeklaruj zmienne ktore poznales i wypisz je na konsoli
		// nastepnie przypisz do niej inna wartosc i znowu ja wypisz na konsoli

		int liczbaCalk = 7;
		System.out.println(liczbaCalk);
		liczbaCalk = 10;
		System.out.println(liczbaCalk);

		double liczbaRzecz = 2.34;
		System.out.println(liczbaRzecz);
		liczbaRzecz = 4.6;
		System.out.println(liczbaRzecz);

		char zn = 's';
		System.out.println(zn);
		zn = 't';
		System.out.println(zn);

		boolean wartosc2 = false;
		System.out.println(wartosc2);
		wartosc2 = true;
		System.out.println(wartosc2);

		String ciag = "abcd";
		System.out.println(ciag);
		ciag = "gggg";
		System.out.println(ciag);

		// znak +

		int a = 10, b = 5;
		String txt1 = "Ala", txt2 = "pies";

		// znak + dla zmiennych liczbowych dzia³a jako zwykle matematyczne dodawanie
		System.out.println(a + b);

		// znak + dla Stringa i jakiejs zmiennej dziala jako znak konkatenacji
		System.out.println(txt1 + " " + txt2);
		System.out.println(txt1 + (a + b));
		System.out.println(a + b + txt1);
		System.out.println();

		// Zadeklaruj dwie zmienne typu double i wykonaj dzia³ania za pomoca operatorów:
		// +, -, *, /

		double x = 2.5, y = 2.3;

		System.out.println("Suma: " + (x + y));
		System.out.println("Roznica: " + (x - y));
		System.out.println("Iloczyn: " + x * y);
		System.out.println("Iloraz: " + x / y);

		// przestowac operatory +,-,*,/ dla innyc zmiennych
		// np pomiedzy doublem i Stringiem, Stringiem i booleanem, intem i doublem
		// i intem i booleanem, charem i intem

		double t = 5.3;
		String napis1 = "Ala";
		boolean u = true;
		int calk = 3;
		char znak1 = 'e';

		System.out.println(t + napis1);
		// System.out.println(t - napis1);
		// System.out.println(t * napis1);
		// System.out.println(t / napis1);

		System.out.println(napis1 + u);
		// System.out.println(napis1 - u);
		// System.out.println(napis1 * u);
		// System.out.println(napis1 / u);

		System.out.println(calk + t);
		System.out.println(calk - t);
		System.out.println(calk * t);
		System.out.println(calk / t);

		// inty zaokraglamy w dó³
		System.out.println(19 / 10);

		// System.out.println(6 + false);
		// System.out.println(6 - false);
		// System.out.println(6 * false);
		// System.out.println(6 / false);

		System.out.println('A' + 0);
		System.out.println('B' - 1);
		System.out.println('B' * 2);
		System.out.println('B' / 2);

		double i = 4.3, j = 8.1;
		double suma = i + j, roznica = i - j, iloczyn = i * j, iloraz = i / j;

		System.out.println(suma);
		System.out.println(roznica);
		System.out.println(iloczyn);
		System.out.println(iloraz);

		// operacje na liczbach
		int k = 5;
		System.out.println(k);

		// zwiekszenie liczby o 3
		k = k + 3;
		System.out.println(k);

		// to to samo co wyzej ale ³adniej i szybciej
		k += 3;
		System.out.println(k);

		// zwiekszenie liczby o 1
		k++;
		System.out.println(k);

		// zmniejszenie o 1
		k--;
		System.out.println(k);

		// przetestuj powyzsze dzialania z uzycem znaku *, /

		// przemno¿enie razy 3
		k *= 3;
		System.out.println(k);

		// podzielenie przez 3
		k /= 3;
		System.out.println(k);
		
		
		

	}

}
