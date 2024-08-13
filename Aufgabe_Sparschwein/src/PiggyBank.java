public class PiggyBank {
    private int anzahl_1cent;
    private int anzahl_10cent;
    private int anzahl_50cent;
    private int anzahl_1euro;
    private int max_anzahl;
    private boolean aufgebrochen = false;
    private int freiraum;

    // constructor
    public void init(int max_anzahl){
        this.anzahl_1cent = 0;
        this.anzahl_10cent = 0;
        this.anzahl_50cent = 0;
        this.anzahl_1euro = 0;
        this.max_anzahl = max_anzahl;
        this.freiraum = max_anzahl;
    }

    //Methods
    public int add1Cents(int muenzen_1cent){
        if (muenzen_1cent <= freiraum){
            this.anzahl_1cent += muenzen_1cent;
            this.freiraum -= muenzen_1cent;
            return 0;
        } else {
            this.anzahl_1cent += this.freiraum;
            this.freiraum = 0;
            return muenzen_1cent - this.anzahl_1cent;
        }
    }
    public int add10Cents(int muenzen_10cent){
        if (muenzen_10cent <= freiraum){
            this.anzahl_10cent += muenzen_10cent;
            this.freiraum -= muenzen_10cent;
            return 0;
        } else {
            this.anzahl_10cent += this.freiraum;
            this.freiraum = 0;
            return muenzen_10cent - this.anzahl_10cent;
        }
    }
    public int add50Cents(int muenzen_50cent){
        if (muenzen_50cent <= freiraum){
            this.anzahl_50cent += muenzen_50cent;
            this.freiraum -= muenzen_50cent;
            return 0;
        } else {
            this.anzahl_50cent += this.freiraum;
            this.freiraum = 0;
            return muenzen_50cent - this.anzahl_50cent;
        }
    }
    public int add1euro(int muenzen_1euro){
        if (muenzen_1euro <= freiraum){
            this.anzahl_1euro += muenzen_1euro;
            this.freiraum -= muenzen_1euro;
            return 0;
        } else {
            this.anzahl_1euro += this.freiraum;
            this.freiraum = 0;
            return muenzen_1euro - this.anzahl_1euro;
        }
    }

    public void ausgeben(){
        System.out.printf("Anzahl 1 cent: %d\nAnzahl 10 cents: %d\nAnzahl 50 cents: %d\nAnzahl 1 euro: %d\n",
                            anzahl_1cent, anzahl_10cent, anzahl_50cent, anzahl_1euro);
        System.out.printf("Freiraum: %d\n", freiraum);
    }

}
