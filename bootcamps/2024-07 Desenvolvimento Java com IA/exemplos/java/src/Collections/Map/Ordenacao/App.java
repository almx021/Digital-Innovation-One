package Map.Ordenacao;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EventScheduler eventScheduler = new EventScheduler();
        
        eventScheduler.addEvent(LocalDate.of(3040, 12, 30), "N2", "A2");
        eventScheduler.addEvent(LocalDate.of(3040, 12, 10), "N1", "A1");
        eventScheduler.addEvent(LocalDate.of(2140, 1, 21), "N3", "A6");
        eventScheduler.addEvent(LocalDate.of(2020, 3, 15), "N0", "A0");

        eventScheduler.showScheduler();

        eventScheduler.getNextEvent();
    }
}
