package src;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        if (pojemnosc <= 0) {
            System.out.println("Liczba nie może być mniejsza od zera!");
        }
        this.ksiazki = new Ksiazka[pojemnosc];
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i] == null) {
                ksiazki[i] = ksiazka;
                break;
            }
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Aktualnie dostępne książki: ");
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i] != null) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public void znajdzKsiazkepoTytule(String tytul) {
        try {
            int counter = 0;
            for (int i = 0; i < ksiazki.length; i++) {
                if ((ksiazki[i].getTytul().toLowerCase()).contains(tytul.toLowerCase())) {
                    counter += 1;
                    ksiazki[i].wypiszInfo();
                }
            }
            if (counter == 0) {
                System.out.println("Nie ma takiej książki! ");
            }
        } catch (NullPointerException e) {
            System.out.println("Biblioteka jest pusta!");
        }
    }

    public Ksiazka zwrocKsiazkepoTytule(String tytul){
        for (int i = 0; i < ksiazki.length; i++) {
            if ((ksiazki[i].getTytul().toLowerCase()).contains(tytul.toLowerCase())) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int ksiazkicount = 0;
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i] != null) {
                ksiazkicount += 1;
            }
        }
        return ksiazkicount;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) throws IllegalAccessException {
        czytelnik.zwiekszLiczbeWypozyczen();
        (zwrocKsiazkepoTytule(tytul)).wypozycz();
        System.out.println("Wypożyczono: " + zwrocKsiazkepoTytule(tytul).getTytul());
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) throws IllegalAccessException {
        czytelnik.zmniejszLiczbeWypozyczen();
        (zwrocKsiazkepoTytule(tytul)).zwroc();
        System.out.println("Zwrócono: " + zwrocKsiazkepoTytule(tytul).getTytul());
    }
}