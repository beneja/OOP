package sem4.Scheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataForm {
    public String normalizedData(LocalDateTime locDat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return locDat.format(formatter);
    }
}
