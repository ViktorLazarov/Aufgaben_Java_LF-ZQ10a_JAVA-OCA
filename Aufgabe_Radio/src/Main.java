public class Main {
    public static void main(String[] args) {
        Radio radio1 = new Radio();

        radio1.einschalten();
        radio1.lauter(2);
        radio1.suchenNachRechts(250);
        radio1.ausschalten();

        System.out.println(radio1.RadioInfo());

    }
}