package src;

public class Main{
public static void main(String[] args) throws IllegalAccessException {

    // stworzenie obiektow i testowanie metod klasy ksiazka

    Ksiazka ksiazka1 = new Ksiazka("Wuthering Heights", "Emily Bronte", 324, true);
    ksiazka1.wypozycz();
    System.out.println("Książka po wypożyczeniu: ");
    ksiazka1.wypiszInfo();
    ksiazka1.zwroc();
    System.out.println("Książka po zwróceniu: " );
    ksiazka1.wypiszInfo();

    Ksiazka ksiazka2 = new Ksiazka("1984", "Jor Jor Well", 124, true);
    System.out.println("Książka druga: ");
    ksiazka2.wypiszInfo();

    Ksiazka ksiazka3 = new Ksiazka("Dżuma", "Alber Camus", 254, true);
    System.out.println("Książka trzecia: ");
    ksiazka3.wypiszInfo();

    //storzenie obiektów i testowanie metod klasy Czytelnik
    System.out.println("Czytelnik");

    Czytelnik czytelnik = new Czytelnik(1, "67717", "Kowalski", "Jan");
    czytelnik.wypiszDane();

    Czytelnik czytelnik1 = new Czytelnik(5, "12345", "Nowak", "Janina");

    System.out.println("Zwiększona liczba wyp. Jana: " + czytelnik.zwiekszLiczbeWypozyczen());

    System.out.println("Następnie zmniejszona liczba wyp. Jana: " + czytelnik.zmniejszLiczbeWypozyczen());

    // scenariusz biblioteki
    System.out.println("Scenariusz metod biblioteki");

    Biblioteka biblioteka = new Biblioteka(3);
    biblioteka.dodajKsiazke(ksiazka2);
    biblioteka.dodajKsiazke(ksiazka1);
    biblioteka.dodajKsiazke(ksiazka3);

    biblioteka.wypiszDostepneKsiazki();
    System.out.println("Liczba dostępnych książek: " + biblioteka.policzDostepneKsiazki());

    // wypożyczenie
    System.out.println("Książka wypożyczona: ");
    ksiazka1.wypiszInfo();
    czytelnik.wypiszDane();
    biblioteka.wypozyczKsiazke("wuther", czytelnik);
    ksiazka1.wypiszInfo();
    czytelnik.wypiszDane();

    // zwrócenie
    System.out.println("Książka zwrócona: ");
    biblioteka.zwrocKsiazke("wuther", czytelnik);
    ksiazka1.wypiszInfo();
    czytelnik.wypiszDane();








}}