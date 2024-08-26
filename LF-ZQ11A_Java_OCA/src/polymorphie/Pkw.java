package polymorphie;

public class Pkw extends Farzeug {
    //ATTRIBUTES
    private String getriebeArt;

    //CONSTRUCTOR
    public Pkw(String hersteller, int baujahr, String farbe, boolean isNeu, String getriebeArt, int tankVolumen, int konsum) {
        super(hersteller, baujahr, farbe, isNeu, tankVolumen, konsum);
        this.getriebeArt = getriebeArt;
    }

    //GETTERS AND SETTERS
    public String getGetriebeArt() {
        return getriebeArt;
    }

    public void setGetriebeArt(String getriebeArt) {
        this.getriebeArt = getriebeArt;
    }

    //METHODS

    @Override
    public void BerechneRange() {
        System.out.println("Range: " + (tankVolumen / konsum) * 100 + " km.");
    }
}
