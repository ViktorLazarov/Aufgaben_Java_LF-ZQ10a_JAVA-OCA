package interfaces;

public class GeoForm implements IRechtecksberechnung, IKreisberechnung, IQuadratberechnung {

    @Override
    public void getRFlaeche(int laenge, int breite) {
        System.out.println("Flaeche Rechteck: " + laenge * breite + "cm²");
    }

    @Override
    public void getRUmfang(int laenge, int breite) {
        System.out.println("Umfang Rechteck: " + (laenge + breite) * 2 + "cm");
    }

    @Override
    public void getKFlaeche(double radius) {
        System.out.println(String.format("Flaeche Kreis: %.02fcm²", (radius * radius) * Math.PI));
    }

    @Override
    public void getKUmfang(double radius) {
        System.out.println(String.format("Umfang Kreis: %.02fcm", (2 * radius) * Math.PI));
    }

    @Override
    public void getQFlaeche(int seite) {
        System.out.println("Flaeche Quadrat: " + seite * seite + "cm²");
    }

    @Override
    public void getQUmfang(int seite) {
        System.out.println("Umfang Quadrat: " + seite * 4 + "cm");

    }
}
