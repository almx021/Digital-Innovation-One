package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventScheduler {
    private Map<LocalDate, Event> eventScheduler;

    public EventScheduler() {
        this.eventScheduler = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        eventScheduler.put(date, new Event(name, attraction));
    }

    public void showScheduler() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventScheduler); // localData is automatically used as a comparator because it extends the Comparator class
        System.out.println(eventTreeMap);
    }


    public void getNextEvent() {
        LocalDate currentDate = LocalDate.now();
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventScheduler);

        for (Map.Entry<LocalDate, Event> entry: eventTreeMap.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("The next event is: '" + entry.getValue() + "'. It is scheduled to air on " + entry.getKey());
                break;
            }
        }
    }
}
