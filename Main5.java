/*W pliku `Main5.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Stwórz zmienną  ```max``` i przypisz do niej `0`.
3. Za pomocą pętli ```for``` znajdź liczbę, która jest największa, przypisz ją do zmiennej ```max``` i wypisz na konsoli.
4. Aby to zrobić przeiteruj tablicę i sprawdź czy dany element jest większy od aktualnej wartości `max` – jeśli tak, zaktualizuj zmienną `max`.
5. Sprawdź czy Twój kod będzie działał poprawnie jeśli w tablicy znajdą się **tylko** liczby ujemne.
6. Spróbuj zmodyfikować kod, aby działał on uniwersalnie (podpowiedź: wystarczy zmodyfikować 1 linię kodu).
*/

public class Main5 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		// int max = 0;		
		// int max, min;  --> To nie działa, niezainicjalizowane zmienne		
		long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random()*(1000)) -500;
			System.out.println(numbers[i]);	
			if (numbers[i] > max) {
				max = numbers[i];
			} 
			if (numbers[i] < min) {
				min = numbers[i];
			} 
		}
		System.out.println("Największa wartość to: " + max + ".");
		System.out.println("Najmniejsza wartość to: " + min + ".");
	}

}
