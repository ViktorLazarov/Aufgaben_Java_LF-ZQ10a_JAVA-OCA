public class Plaetzchen {
    private String sorte;
    private String form;
    private String groesse;
    private Boolean verzierung;


    public Plaetzchen(String sorte, String form, String groesse, Boolean verzierung) {
        this.sorte = sorte;
        this.form = form;
        this.groesse = groesse;
        this.verzierung = verzierung;
    }

    public String getSorte() {
        return sorte;
    }

    public void setSorte(String sorte) {
        this.sorte = sorte;
    }

    public String getGroesse() {
        return groesse;
    }

    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Boolean getVerzierung() {
        return verzierung;
    }

    public void setVerzierung(Boolean verzierung) {
        this.verzierung = verzierung;
    }

    public void ausgeben() {
        System.out.printf("Sorte %s, Groesse %s, Form %s, Verzierung %s\n", sorte, groesse, form, verzierung ? "ja" : "nein");
    }
}
