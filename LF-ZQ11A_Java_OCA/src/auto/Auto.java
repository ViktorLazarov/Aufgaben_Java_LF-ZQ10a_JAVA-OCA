package auto;

public class Auto {

    private String marke;
    private int preis;
    private int baujahr;
    private String getriebe;
    private String kraftstoff;

    public Auto(String marke, int preis, int baujahr, String getriebe, String kraftstoff) {
        this.marke = marke;
        this.preis = preis;
        this.baujahr = baujahr;
        this.getriebe = getriebe;
        this.kraftstoff = kraftstoff;
    }

    // Getter und Setter
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis){
        this.preis = preis;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(String getriebe) {
        this.getriebe = getriebe;
    }

    public String getKraftstoff() {
        return kraftstoff;
    }

    public void setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
    }
}
