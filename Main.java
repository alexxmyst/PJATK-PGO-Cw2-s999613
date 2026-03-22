
public static void main(String[] args) {

    Ksiazka ksiazka1 = new Ksiazka("Wuthering Heights", "Emily Bronte", 324, true);
    ksiazka1.wypiszInfo();

    Czytelnik czytelnik = new Czytelnik(2, "67717", "Kowalski", "Jan");

    czytelnik.wypiszDane();

    System.out.println("Zmniejszenie liczby wyp: " + czytelnik.zmniejszLiczbeWypozyczen());
    System.out.println("Zwiększona liczba wyp: " + czytelnik.zwiekszLiczbeWypozyczen());

    





}