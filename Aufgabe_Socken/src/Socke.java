public class Socke {
    private String farbe;
    private boolean trocken;

    // constructor
    public Socke(String farbe, boolean trocken) {
        this.farbe = farbe;
        this.trocken = trocken;
    }

    //Methods
    public boolean istTrocken(){
        return trocken;
    }
    public void trockne(){
        this.trocken = true;
    }
    public void wasche(){
        this.trocken = false;
    }
    public void ausgabe(){
        System.out.printf("Die Socke mit der Farbe %s ist %s.\n", farbe, trocken ? "trocken" : "nass");
    }

}
