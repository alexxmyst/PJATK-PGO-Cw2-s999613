package src;

import src.Biblioteka;
import src.Czytelnik;
import src.Ksiazka;

import java.util.concurrent.Callable;

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






}}