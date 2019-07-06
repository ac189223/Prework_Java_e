/*
W pliku `Main6.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.
*/


public class Main6 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random()*((499) + 1)) + 1;
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println("Element " + i + " to " + numbers[i]);
		}
	}

}
