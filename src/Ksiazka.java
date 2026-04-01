package src;
public class Ksiazka {
    public String getTytul() {
        return tytul;
    }

    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }



        public void wypiszInfo() {
            System.out.println("Tytuł: " + tytul + " Autor: " + autor + " Liczba stron: " + liczbaStron + " Czy dostępna: " + dostepna);

        }

        public void wypozycz() {
            this.dostepna = false;
        }

        public void zwroc() {
            this.dostepna = true;
        }
}