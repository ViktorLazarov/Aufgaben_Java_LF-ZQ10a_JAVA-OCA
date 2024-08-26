package polymorphie;

public class Flugzeug extends Farzeug {
    //ATTRIBUTES
    private boolean isPropeled;

    //CONSTRUCTOR
    public Flugzeug(String hersteller, int baujahr, String farbe, boolean isNeu, boolean isPropeled, int tankVolumen, int konsum) {
        super(hersteller, baujahr, farbe, isNeu, tankVolumen, konsum);
        this.isPropeled = isPropeled;
    }

    //GETTERS AND SETTERS
    public boolean isPropeled() {
        return isPropeled;
    }

    public void setPropeled(boolean propeled) {
        isPropeled = propeled;
    }

    //METHODS
    @Override
    public void BerechneRange() {
        if (isPropeled) {
            System.out.println("Range: " + (tankVolumen / konsum) * 100 + " km.");
        } else {
            System.out.println("Das Flugzeug gleitet über das Feld");
        }
    }
}
