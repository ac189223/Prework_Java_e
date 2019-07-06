/*
W pliku `Main2.java` stwórz tablicę z listą swoich ulubionych owoców. Tablicę nazwij `fruits`.  

Następnie:
1. wypisz w konsoli **pierwszy** owoc, wg wzoru: `Pierwszy owoc to: truskawka`;
2. wypisz w konsoli **ostatni** owoc, wg wzoru: `Ostatni owoc to: malina` (skorzystaj z `length`);
3. w pętli wypisz wszystkie owoce – **każdy w nowej linii** (skorzystaj z `length`).

*/

public class Main2 {

	public static void main(String[] args) {
		String[] fruits = {"banana", "mango", "kiwi", "melon", "ananas"};
		System.out.println("Pierwszy owoc to: " + fruits[0] + ".");
		System.out.println("Ostatni owoc to: " + fruits[fruits.length - 1] + ".");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

}
