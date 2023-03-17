package sem4.Scheduler;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author ivan = new Author("Иванов", "Иван", "Иванович");
        Scheduler one = new Scheduler(new ArrayList<>());
//                ArrayList<Task> two = new ArrayList<>();
        one.addTask(ivan);
        one.addTask(ivan);
//        two.add(new Task(ivan, "Заголовок", "Описание", Priority.Now, LocalDateTime.now().plusHours(3)));
//        two.add(new Task(ivan, "Заголовок34", "Описание34", Priority.Medium, LocalDateTime.now().plusHours(2)));
//        two.sort(new CompletionTimeComparator());
//        System.out.println(two);
        one.showSortedByCompletionTime();
        one.showTasks();
        one.completeTask();
    }
}
