import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
//        LocalDate targetDate = LocalDate.of(2000, Month.AUGUST, 12);

        Mensch viktor = new Mensch("Viktor", 35);

        viktor.vorstellen();
//        if(heute.getMonthValue() == targetDate.getMonthValue() &&
//            heute.getDayOfMonth() == targetDate.getDayOfMonth()){
//            viktor.geburtstag();
//        }
        if (heute.equals(heute)){ // nur zum testen ;)
            viktor.geburtstag();
        }
        viktor.vorstellen();
    }
}