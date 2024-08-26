package polymorphie;

public class EntryPoint {
    public static void main(String[] args) {

        Pkw pkw = new Pkw("Opel",2017, "weiß", true, "Automatik", 100, 10);
        Lkw lkw = new Lkw("Mercedes", 2024, "weiß", true, 2, true, 500, 15);
        Flugzeug flugzeug = new Flugzeug("Boeing", 2023, "weiß", false, false, 2000, 10);

        pkw.BerechneRange();
        lkw.BerechneRange();
        flugzeug.BerechneRange();

    }
}
