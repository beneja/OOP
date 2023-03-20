package sem4.Scheduler;

public interface SchedulerAction {
    void showTasks();

    void showSortedByCompletionTime();

    void completeTask();
}
