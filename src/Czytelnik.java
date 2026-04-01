package src;
public class Czytelnik {
    private String imie;
    private String naziwsko;
    private String nrKarty;
    private int liczbaWyp;

    public Czytelnik(int liczbaWyp, String nrKarty, String naziwsko, String imie) {
        this.liczbaWyp = liczbaWyp;
        this.nrKarty = nrKarty;
        this.naziwsko = naziwsko;
        this.imie = imie;
    }


    public void wypiszDane(){
        System.out.println("Imie: " + imie  + " Nazwisko: " + naziwsko + " Numer karty: " + nrKarty + " Liczba wypozyczen: " + liczbaWyp);

    }

    public int zwiekszLiczbeWypozyczen() throws IllegalAccessException {
        if (this.liczbaWyp < 0) {
            throw new IllegalAccessException("Liczba wypożyczeń nie może być ujemna!");
        }
        return liczbaWyp += 1;
    }

    public int zmniejszLiczbeWypozyczen() throws IllegalAccessException {
        if (this.liczbaWyp <= 0) {
            throw new IllegalAccessException("Liczba wypożyczeń nie może być ujemna ani równa 0!");
        }
        return liczbaWyp -= 1;
    }










}