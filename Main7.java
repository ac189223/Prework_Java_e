/*
W pliku `Main7.java` stwórz tablicę o nazwie `randNumbers` ze 100 losowymi liczbami z zakresu `0-20`.

1. Tablicę wypełnij za pomocą pętli `for` – do otrzymania losowej liczby użyj kodu umieszczonego w pliku.
2. Wypisz na stronie wylosowane liczby, oddzielone od siebie przecinkiem `18,12,1,3...`.
3. Oblicz sumę liczb z tablicy, wynik przypisz do zmiennej `sum`.
4. Wypisz w konsoli (w nowej linii) sumę wg wzoru: `Suma 100 losowych liczb od 0 do 20 to: 876.`.
*/

import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
		generator.nextInt(21);
		int[] numbers = new int[100];
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			numbers[i] = generator.nextInt(21);
			sum += numbers[i];
		}
		System.out.println("Suma 100 losowych liczb od 0 do 20 to: " + sum + ".");
	}

}
