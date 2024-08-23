package interfaces;

public class Student implements IStudentAttribute, IStudentMethoden{
    private String name;

    // constructor
    public Student(String name) {
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // getter and setter ^^^

    @Override
    public void zeigeAlter() {
        System.out.println("Alter des Studenten: " + ALTER);
    }

    @Override
    public void zeigeMatrikelNummer() {
        System.out.println("MatrikelNr. des Studenten: " + MATRIKELNUMMER);
    }

    @Override
    public void zeigeName() {
        System.out.println("Name des Studenten: " + name);
    }
}
