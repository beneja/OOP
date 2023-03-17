package sem4.Scheduler;

import java.util.Comparator;

public class CompletionTimeComparator implements Comparator<Task>{
    @Override
    public int compare(Task t1, Task t2) {
        if (t1.getCompletionTime().isEqual(t2.getCompletionTime())) {
            return 0;
        }
        if (t1.getCompletionTime().isBefore(t2.getCompletionTime())) {
            return -1;
        }else {
            return 1;}
    }
}
