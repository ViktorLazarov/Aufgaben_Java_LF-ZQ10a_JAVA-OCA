package auto;

public class Kunde {
    private String vorname;
    private String nachname;

    public Kunde(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    // Getter für den Vornamen
    public String getVorname() {
        return vorname;
    }

    // Setter für den Vornamen
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    // Getter für den Nachnamen
    public String getNachname() {
        return nachname;
    }

    // Setter für den Nachnamen
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
