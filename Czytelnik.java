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

    public int zwiekszLiczbeWypozyczen(){
        if (this.liczbaWyp >= 0) {
            return this.liczbaWyp += 1;
        }
        return 0;
    }

    public int zmniejszLiczbeWypozyczen(){
        if (this.liczbaWyp >= 0) {
            return this.liczbaWyp -= 1;
        }
        return 0;
    }










}