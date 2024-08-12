public class Main {
    public static void main(String[] args) {
        Plaetzchen platz1 = new Plaetzchen("Kokos", "mittel", "rund", false);
        Plaetzchen platz2 = new Plaetzchen("Affennuss", "klein", "rund", false);
        Plaetzchen platz3 = new Plaetzchen("Honigkuchen", "gross", "rechteckig", true);

        System.out.println("+++ Plaetzchenliste +++");
        platz1.ausgeben();
        platz2.ausgeben();
        platz3.ausgeben();
    }
}