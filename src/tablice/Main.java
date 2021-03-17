package tablice;

public class Main {
	public static void main(String[] args) {
		
		// zadeklaruj tablice intow na i przypisz do niej 8 liczb
		 
		// wyswietl ca³a tablice
		// wyswietl tylko liczby wieksze niz 4
		// policz sume elementów tablicy
		// znajdz element najwiekszy
		// znajdz element najmniejszy
		
		int tab[] = {5, 3, 7, 1, 8, 2, 5, 4};
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > 4) {
				System.out.println(tab[i] + " ");
			}
		}
		int suma = 0;
		
		for (int i = 0; i < tab.length; i++) {
			suma += tab[i];
		}
		
		int min = tab[0], max = tab[0];
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] < min) {
				min = tab[i];
			}
			
			if(tab[i] > max) {
				max = tab[i];
			}			
		}
		
		System.out.println("Element najwiekszy: " + max + "\nElement najmniejszy: " + min);
		
	}

}
