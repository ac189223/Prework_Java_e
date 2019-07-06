/*W pliku `Main3.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Stwórz zmienną  ```sum``` i przypisz do niej liczbę `0`.
3. Za pomocą pętli ```for``` oblicz sumę liczb z tablicy.
4. Wypisz sumę na konsoli, wg wzoru: `Suma elementów tablicy to: 381.`.
*/

public class Main3 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random()*((499) + 1)) + 1;
		}

	// Generujemy losowe liczby na kolejne miejsca w tabeli
	// Zakres generowania to 499 liczb plus jedna, a dokładnie
	// (0, 498 + 1) + 1 = (0, 499) + 1 = (1, 500)
	// (int) konwertuje doubla z random do integera i traktuje go jak integera

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += numbers[i];
			System.out.println(numbers[i]);
		}
		System.out.println("Suma elementów tablicy to: " + sum + ".");
	}

}
