public class Radio {
    private boolean eingeschaltet = false;
    private int lautstaerke = 0;
    private int frequenz = 0;


    //default constructor
    public Radio() {

    }

    //Getters and Setters
    public Boolean getEingeschaltet() {
        return eingeschaltet;
    }

    public void setEingeschaltet(Boolean eingeschaltet) {
        this.eingeschaltet = eingeschaltet;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int getFrequenz() {
        return frequenz;
    }
    public void setFrequenz(int frequenz) {
        this.frequenz = frequenz;
    }

    //Methods
    public void lauter(int erhoehen) {
        this.lautstaerke += erhoehen;
    }
    public void leiser(int verringern) {
        this.lautstaerke -= verringern;
    }

    public void einschalten() {
        this.eingeschaltet = true;
    }
    public void ausschalten() {
        this.eingeschaltet = false;
    }

    public void suchenNachRechts(int neu_frequenz){
        this.frequenz += neu_frequenz;
    }
    public void suchenNachLinks(int neu_frequenz){
        this.frequenz -= neu_frequenz;
    }

    public boolean isAn() {
        return eingeschaltet;
    }
    public String RadioInfo(){
        return String.format("Radio %s: Frequenz= %d, Lautstaerke=%d.\n", eingeschaltet ? "an" : "aus", frequenz, lautstaerke);
    }
}
