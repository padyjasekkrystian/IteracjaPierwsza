package tematy.moje;

public class InstrukcjeWarunkowe {

	public static void main(String[] args) {
		
		// 1) Zadeklaruj dwie zmienne typu String i spróbuj je porównaæ operatorem >. Jaki jest efekt programu?
		String a = "Ala", b = "Kot";
		//System.out.println(a>b);
	    // Operatora > nie mo¿emy zastosowaæ do zmiennych typu String
		
		
		// 2)Napisz program w którym deklarujesz 3 zmienne typu int (ró¿ne od siebie) i
		// program wyswietli najmniejsz¹ z nich
		int c = 3, d = 7, e = 1;
		// sprawdzamy czy c jest mniejsza od d i e
		if (c < d && c < e) {
			System.out.println("Najmniejsza zmienna to c = " + c);
		} else if (d < e) {
			// porównujemy d i e
			System.out.println("Najmniejsza zmienna to d = " + d);
		} else {
			System.out.println("Najmniejsza zmienna to e = " + e);
		}
		
		
		// 3)Napisz program w którym deklarujesz 2 zmienne typu int. Sprawdz czy s¹ sobie równe
		
		int f = 2, g = 3;
		// program wyswietla true/false
		System.out.println("Zmienne s¹ sobie równe: " + (f == g));
		
		
		// 4)Napisz program który sprawdzi czy œrednia dwóch liczb typu double jest wiêksza od 5
		
		double h = 3.2, i = 1.2;
		// program wyswietli true/false
		System.out.println("Srednia dwoch liczb jest wieksza od 5: " + (((h + i) / 2) > 5));
		
		
		// 5)Napisz program w którym deklarujesz 3 zmienne typu int(ró¿ne od siebie). Program ma wyswietliæ je posortowane malej¹co.

		int j = 4, k = 2, l = 7, min, mid, max;
		
		// sprawdzamy czy j jest najmniejsze
		if (j < k && j < l) {
			min = j;

			if (k < l) {
				mid = k;
				max = l;
			} else {
				max = k;
				mid = l;
			}
		} else if (k < l && k < j) {
			min = k;

			if (j < l) {
				mid = j;
				max = l;
			} else {
				mid = l;
				max = j;
			}
		} else {
			min = l;
			
			if (k < j) {
				max = j;
				mid = k;
			}else {
				max = k;
				mid = l;
			}

		}
		
		System.out.println("Liczby posortowane malej¹co: " + min + " " + mid + " " + max);
		
		
		int y = 5, x;
		
		if (y > 6) {
			x = 4;
		}else {
			x = 3;
		}
		
		System.out.println(x);
		
		
		
		
		
	}

}
