public class Main {
    public static void main(String[] args) {
        Filiale filiale1 = new Filiale("Kaufland", 100, 20);

        filiale1.einkauf(2.50, 5);
        filiale1.verkauf(3, 100);
        filiale1.ausgeben();
    }
}