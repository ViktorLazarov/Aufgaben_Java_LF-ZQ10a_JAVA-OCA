package polymorphie;

public class Lkw extends Farzeug {
    //ATTRIBUTE
    private int achsen;
    private boolean isKipper;

    //CONSTRUCTOR
    public Lkw(String hersteller, int baujahr, String farbe, boolean isNeu, int achsen, boolean isKipper, int tankVolumen, int konsum) {
        super(hersteller, baujahr, farbe, isNeu, tankVolumen, konsum);
        this.achsen = achsen;
        this.isKipper = isKipper;
    }

    //GETTERS AND SETTERS
    public int getAchsen() {
        return achsen;
    }

    public void setAchsen(int achsen) {
        this.achsen = achsen;
    }

    public boolean isKipper() {
        return isKipper;
    }

    public void setKipper(boolean kipper) {
        isKipper = kipper;
    }

    //METHODS

    @Override
    public void BerechneRange() {
        if (isKipper) {
            System.out.println("Range in hours: " + tankVolumen / konsum + " hours.");
        } else {
            System.out.println("Range: " + (tankVolumen / konsum) * 100 + " km.");
        }
    }
}
