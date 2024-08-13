public class Filiale {
    private String name;
    private double kasse;
    private int warenbestand;

    // constructor
    public Filiale(String name, double kasse, int warenbestand) {
        this.name = name;
        this.kasse = kasse;
        this.warenbestand = warenbestand;
    }

    // Methods
    public void ausgeben(){
        System.out.printf("Filiale Name: %s, Warenbestand: %d, Kasse: %.2f\n", name, warenbestand, kasse);
    }

    public void einkauf(double product_preis, int menge){
        this.kasse -= (product_preis * menge);
        this.warenbestand += menge;
    }
    public void verkauf(double product_preis, int menge){
        if (this.warenbestand >= menge){
            this.kasse += (product_preis * menge);
            this.warenbestand -= menge;
        } else {
            System.out.println("Der Warenbestand ist zu niedrig, um den Verkauf abzuschließen");
        }
    }

}
