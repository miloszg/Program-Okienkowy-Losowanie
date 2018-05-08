# Program-Okienkowy-Losowanie
Prosty program okienkowy stworzony na zajęcia laboratoryjne

1. Utworzyć klasę główną GUI oraz klasę Okno dziedziczącą po JFrame. Niech klasa Okno zawiera jeden konstruktor pobierający nazwaOkna ("Witaj w losowaniu Małego Lotka!"). W metodzie main utworzyć i wyświetlić obiekt typu Okno. W konstruktorze Okna wywołać konstruktor nadklasy, nadać oknu rozmiary (np. 800 i 200) i wyłączyć możliwość zmiany rozmiaru okna. Nadać rozkład typu BorderLayout. Uworzyć JPanel o rozkładzie FlowLayout. Do panelu dodać komponenty JProgressBar (max = 5), JTextField oraz JLabel ("Wynik losowania to: "). Panel umieścić na górze okna. Zablokować bezpośrednią edycję zawartości pola tekstowego poprzez metodę setEditable oraz wykorzystać jego metodę setFocusable i ustawić stan na false. W klasie dodać pole indeks o wartości 0. (3 pkt)

2. Utworzyć kolekcję ArrayList i dodać do niej wartości od "1" do "29". Zainicjować JTextField pozycją z utworzonej kolekcji o indeksie zapisanym w indeks. (1 pkt)

3. Obsłużyć zdarzenie: przewijanie kółkiem myszy nad polem tekstowym powinno wywoływać metodę setLosowanie, która pobierze liczbę "skoków" zliczanych w trakcie scrollowania kółkiem myszy (typ int). Wykorzystać anonimowe klasy wewnętrzne i MouseWheelListener. Utworzyć metodę setLosowanie, która ustali nową wartość pola tekstowego. Metoda powinna zwiększać/zmniejszać aktualną wartość pola indeks w zależności od wartości argumentu metody. Następnie metoda powinna przypisywać do pola tekstowego wartość z kolekcji wskazywaną przez zmieniony indeks. Dopuszczalny zakres wartości indeksu to od 0 do wielkości kolekcji (metoda size()). (3 pkt)

4. Zwolnienie klawisza ‘L’ powinno wywoływać metodę refreshGUI. Wykorzystać anonimowe klasy wewnętrzne i KeyAdapter. Metoda refreshGUI powinna dodawać do napisu etykiety (JLabel) aktualną wartość z kolekcji wskazywaną przez indeks dopóki ilość dodanych liczb jest mniejsza niż 5. Dodawaną pozycję usuwać z kolekcji. Ponadto metoda powinna także zwiększać wartość wyświetlaną przez pasek postępu (JProgressBar). (3 pkt)

5. Jeżeli kursor najedzie na komponent JProgressBar i jeżeli wylosowano już 5 numerów tekst etykiety powinien zmienić się na „Koniec losowania!”. Wykorzystać anonimowe klasy wewnętrzne i słuchacz myszy. (2 pkt)
