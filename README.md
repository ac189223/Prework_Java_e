<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Tablice – zadania

Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  
Zadania dodatkowe nie są obowiązkowe do zaliczenia preworku, ale postaraj się je wykonać.

#### Zadanie 1

W pliku `Main1.java`

1. Stwórz tablicę z **trzema** elementami (np. z liczbami). Tablicę nazwij `threeElements`.
2. Następnie wypisz na konsoli po kolei elementy tej tablicy, rozdzielając je spacją.
3. Nie korzystaj w tym zadaniu z pętli.

#### Zadanie 2

W pliku `Main2.java` stwórz tablicę z listą swoich ulubionych owoców. Tablicę nazwij `fruits`.  

Następnie:

1. wypisz w konsoli **pierwszy** owoc, wg wzoru: `Pierwszy owoc to: truskawka`;
2. wypisz w konsoli **ostatni** owoc, wg wzoru: `Ostatni owoc to: malina` (skorzystaj z `length`);
3. w pętli wypisz wszystkie owoce – **każdy w nowej linii** (skorzystaj z `length`).

#### Zadanie 3

W pliku `Main3.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Stwórz zmienną  ```sum``` i przypisz do niej liczbę `0`.
3. Za pomocą pętli ```for``` oblicz sumę liczb z tablicy.
4. Wypisz sumę na konsoli, wg wzoru: `Suma elementów tablicy to: 381.`.

#### Zadanie 4

W pliku `Main4.java`

1. Stwórz tablicę o nazwie `numbers` z 10 dowolnymi liczbami.
2. W pętli ```for``` sprawdź, które są parzyste i wypisz je w konsoli **jedna pod drugą**.
3. Utwórz dodatkową zmienną `sumOdd` o wartości `0`.
4. Zmodyfikuj pętlę z pkt. 1 w ten sposób, aby **dodatkowo** sumowała liczby nieparzyste.
5. Wyświetl w konsoli dodatkowy komunikat, wg wzoru: `Suma liczb nieparzystych to: 87.`.


#### Zadanie 5

W pliku `Main5.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Stwórz zmienną  ```max``` i przypisz do niej `0`.
3. Za pomocą pętli ```for``` znajdź liczbę, która jest największa, przypisz ją do zmiennej ```max``` i wypisz na konsoli.
4. Aby to zrobić przeiteruj tablicę i sprawdź czy dany element jest większy od aktualnej wartości `max` – jeśli tak, zaktualizuj zmienną `max`.
5. Sprawdź czy Twój kod będzie działał poprawnie jeśli w tablicy znajdą się **tylko** liczby ujemne.
6. Spróbuj zmodyfikować kod, aby działał on uniwersalnie (podpowiedź: wystarczy zmodyfikować 1 linię kodu).

#### Zadanie 6

W pliku `Main6.java`

1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.

#### Zadanie 7 – **dodatkowe**

W pliku `Main7.java` stwórz tablicę o nazwie `randNumbers` ze 100 losowymi liczbami z zakresu `0-20`.

1. Tablicę wypełnij za pomocą pętli `for` – do otrzymania losowej liczby użyj kodu umieszczonego w pliku.
2. Wypisz na stronie wylosowane liczby, oddzielone od siebie przecinkiem `18,12,1,3...`.
3. Oblicz sumę liczb z tablicy, wynik przypisz do zmiennej `sum`.
4. Wypisz w konsoli (w nowej linii) sumę wg wzoru: `Suma 100 losowych liczb od 0 do 20 to: 876.`.


#### Zadanie 8 – **dodatkowe**

W pliku `Main8.java` znajduje się tablica z temperaturami.

1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na stopnie Fahrenheit'a.  
   Przelicznik jest następujący: `tempCelc * 1.8 + 32`.
2. Aby to zrobić przeiteruj tablicę i nadpisz daną temperaturę nową, obliczoną wartością.
3. Oblicz średnią temperaturę z nowo wyliczonych wartości i przypisz do zmiennej `avg`.
4. Wypisz ją w konsoli wg wzoru: `Średnia temperatura to: 3.95` – zaokrąglij liczbę do dwóch miejsc po przecinku.  
Możesz użyć użyj funkcji: 
 ```java 
 String.format( "%.2f", variableToFormat );
 ```
