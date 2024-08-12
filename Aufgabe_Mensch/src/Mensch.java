public class Mensch {
    private String name;
    private int alter;


    public Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void vorstellen(){
        System.out.printf("Hello, ich bin %s und ich bin %d Jahre alt.\n", name, alter);
    }
    public void geburtstag(){
        this.alter ++;
    }
}
