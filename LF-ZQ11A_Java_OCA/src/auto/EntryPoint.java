package auto;

public class EntryPoint {
    public static void main(String[] args) {
        Gebrauchtwagen wagen1 = new Gebrauchtwagen("Opel", 25000, 2017, "Automatik", "Benzin", 5000, true);
        Kunde kunde1 = new Kunde("Viktor", "Lazarov");

        System.out.printf("Der Kunde %s %s möchte den Gebrauchtwagen mit folgenden Parametern kaufen:\nMarke: %s\nPreis: %d\nBaujahr: %d\nGetriebe: %s\nKraftstoff: %s\nKilometerstand: %d\nTÜV: %s", kunde1.getVorname(), kunde1.getNachname(), wagen1.getMarke(), wagen1.getPreis(), wagen1.getBaujahr(), wagen1.getGetriebe(), wagen1.getKraftstoff(), wagen1.getKilometerstand(), wagen1.isTuev() ? "Hat TÜV" : "Hat kein TÜV");
        
    }
}
