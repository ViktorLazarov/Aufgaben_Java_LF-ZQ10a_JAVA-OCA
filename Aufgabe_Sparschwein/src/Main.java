public class Main {
    public static void main(String[] args) {
        PiggyBank bank1 = new PiggyBank();
        PiggyBank bank2 = new PiggyBank();

        bank1.init(20);
        bank2.init(30);
        System.out.println(bank1.add1Cents(25));
        System.out.println(bank1.add10Cents(8));
        System.out.println(bank1.add50Cents(2));
        System.out.println(bank1.add1euro(4));


        bank1.ausgeben();

    }
}