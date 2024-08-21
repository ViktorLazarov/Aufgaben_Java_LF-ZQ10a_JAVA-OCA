package Interfaces;

public class GeoForm implements IRechtecksberechnungen, IKreisberechnung, IQuadratberechnung {

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
        System.out.println("Flaeche Kreis: " + (radius * radius) * Math.PI + "cm²");
    }

    @Override
    public void getKUmfang(double radius) {
        System.out.println("Umfang Rechteck: " + (2 * radius) * Math.PI + "cm");
    }

    @Override
    public void getQFlaeche(int laenge) {
        System.out.println("Flaeche Quadrat: " + laenge * laenge + "cm²");
    }

    @Override
    public void getQUmfang(int laenge) {
        System.out.println("Umfang Quadrat: " + laenge * 4 + "cm");
    }
}
