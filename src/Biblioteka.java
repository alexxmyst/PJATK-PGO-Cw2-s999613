package src;
public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
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
                if ((ksiazki[i].getTytul()).contains(tytul)) {
                    ksiazki[i].wypiszInfo();
                    counter += 1;
                }
            }
            if (counter == 0) {System.out.println("Nie ma takiej książki! ");}
        } catch (NullPointerException e) {
            System.out.println("Biblioteka jest pusta!");
        }
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

}