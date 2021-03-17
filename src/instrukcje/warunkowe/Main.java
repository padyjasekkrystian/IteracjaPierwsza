package instrukcje.warunkowe;

public class Main {
	
	public static void main(String[] args) {
		
		int ocena = 7;

		switch (ocena) {
			case 2:
				System.out.println("Nie zaliczy�e�");
				break;
			case 3:
				System.out.println("Zda�es dostatecznie");
				break;
			case 4:
				System.out.println("Zda�e� dobrze");
				break;
			case 5:
				System.out.println("Zda�e� bardzo dobrze");
				break;
			default:
				System.out.println("Nierozpoznana ocena");
		}
		
		// Zrób intstrukcje switch case, dla wartosci String
		// niech bedzie to reprezentacja miesiecy i w zaleznosci od
		// podanego miesiaca podac klimat
		
		String miesiac = "styczen";
		
		switch(miesiac ) {
			case "styczen":
				System.out.println("Zima");
				break;
			case "luty":
				System.out.println("Zima");
				break;
			case "czerwiec":
				System.out.println("lato");
				break;
			case "listopad":
				System.out.println("Jesien");
			default:
				System.out.println("nie ma takiego miesiaca");
		}
		
		// Zadeklaruj 2 zmienne typu int, wyswietl która z tych dwoch liczb jest
		// wieszka i o ile, np dla 4 i 1 chcemy wyswietlic: 4 jest wieksza od 1 o 3
		
		int a = 4, b = 5;
		
		if(a > b) {
			System.out.println(a + " jest wieksza od " + b + " o " + (a - b));
		}else {
			System.out.println(b + " jest wieksze od " + a + " o " + (b - a));
		}
		
		// Napisz program sprawdzajacy czy podana liczba jest parzysta
		
		int d = 3;

		if (d % 2 == 0) {
			System.out.println("liczba jest parzysta");
		} else {
			System.out.println("liczba jest nieparzysta");
		}
		
		// Sprawdzmy czy zadeklarowana liczba typu double, nalezy do przedzia�u (1,4)
		// czy moze [6,8]
		// czy jest spoza przedzialu
		
		double h = 3.5;

		if (h > 1 && h < 4) {
			System.out.println("liczba nalezy do przedzialu (1,4)");
		} else if (h >= 6 && h <= 8) {
			System.out.println("liczba nalezy do przedzialu [6,8]");
		} else {
			System.out.println("liczba nie nalezy do zadnego przedzialu");
		}
		
	}

}
