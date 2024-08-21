package auto;

public class Gebrauchtwagen extends Auto{
    private int kilometerstand;
    private boolean tuev;

    public Gebrauchtwagen(String marke, int preis, int baujahr, String getriebe, String kraftstoff, int kilometerstand, boolean tuev) {
        super(marke, preis, baujahr, getriebe, kraftstoff);
        this.kilometerstand = kilometerstand;
        this.tuev = tuev;
    }

    // Getter für kilometerstand
    public int getKilometerstand() {
        return kilometerstand;
    }

    // Setter für kilometerstand
    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    // Getter für tuev
    public boolean isTuev() {
        return tuev;
    }

    // Setter für tuev
    public void setTuev(boolean tuev) {
        this.tuev = tuev;
    }

    // Getters
    public String getMarke() {
        return super.getMarke();
    }

    public int getPreis() {
        return super.getPreis();
    }

    public int getBaujahr() {
        return super.getBaujahr();
    }

    public String getGetriebe() {
        return super.getGetriebe();
    }

    public String getKraftstoff() {
        return super.getKraftstoff();
    }

    // Setters
    public void setMarke(String marke) {
        super.setMarke(marke);
    }

    public void setPreis(int preis) {
        super.setPreis(preis);
    }

    public void setBaujahr(int baujahr) {
        super.setBaujahr(baujahr);
    }

    public void setGetriebe(String getriebe) {
        super.setGetriebe(getriebe);
    }

    public void setKraftstoff(String kraftstoff) {
        super.setKraftstoff(kraftstoff);
    }

}
