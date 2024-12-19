


public class Obdelnik {

    public static int pocetObdelniku;

    private int vyska;
    private int sirka;

    public Obdelnik() {
        pocetObdelniku++;
        //bezparametricky konstruktor
        //  Nastaveni vychozich hodnot
    }

    public Obdelnik(int vyska, int sirka) {
        pocetObdelniku++;
        this.vyska = vyska;
        this.sirka = sirka;
    }

    static int pocetObdelniku() {
        return pocetObdelniku;
    }

    public int obvod() {
        return (vyska * 2) + (sirka * 2);
    }

    public int getObsah() {
        return vyska * sirka;
    }


    public int getVyska() {
        return vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }
}
