package interfaces;

public class EntryPoint {
    public static void main(String[] args) {
        GeoForm rechteck = new GeoForm();
        GeoForm kreis = new GeoForm();
        GeoForm quadrat = new GeoForm();

        rechteck.getRFlaeche(5,6);
        rechteck.getRUmfang(5,6);

        kreis.getKFlaeche(5);
        kreis.getKUmfang(5);

        quadrat.getQFlaeche(5);
        quadrat.getQUmfang(5);
    }
}
