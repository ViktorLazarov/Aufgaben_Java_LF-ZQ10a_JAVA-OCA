package polymorphie;

public class Farzeug {
    // ATTRIBUTES
    protected String hersteller;
    protected int baujahr;
    protected String farbe;
    protected boolean isNeu;
    protected int tankVolumen;
    protected int konsum;


    //CONSTRUCTOR
    public Farzeug(String hersteller, int baujahr, String farbe, boolean isNeu, int tankVolumen, int konsum) {
        this.hersteller = hersteller;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.isNeu = isNeu;
        this.tankVolumen = tankVolumen;
        this.konsum = konsum;
    }

    // GETTERS AND SETTERS
    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public boolean isNeu() {
        return isNeu;
    }

    public void setNeu(boolean neu) {
        isNeu = neu;
    }

    public int getTankVolumen() {
        return tankVolumen;
    }

    public void setTankVolumen(int tankVolumen) {
        this.tankVolumen = tankVolumen;
    }

    public int getKonsum() {
        return konsum;
    }

    public void setKonsum(int konsum) {
        this.konsum = konsum;
    }

    //METHODS
    public void BerechneRange() {
        System.out.println("Range: " + (tankVolumen / konsum) * 100);
    }
}
