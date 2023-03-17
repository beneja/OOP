package sem4.Scheduler;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduler {
    private List<Task> taskList;
    Scanner sn = new Scanner(System.in);

    public Scheduler(List<Task> taskList) {
        this.taskList = taskList;
    }

    public void addTask(Author author){
        System.out.println("Введите название задачи: ");
        String title = sn.nextLine();
        System.out.println("Введите описание задачи: ");
        String description = sn.nextLine();
        System.out.printf(String.format("Выберите приоритет: \n 1 - %s\n 2 - %s\n 3 - %s\n",
                Priority.Low, Priority.Medium, Priority.Now));
        String priorityS = sn.nextLine();
        Priority priority = Priority.Low;
        switch (priorityS){
            case("1") :
            case("2") : priority = Priority.Medium;
            case("3") : priority = Priority.Now;
        }
        System.out.println("Назначьте время завершения в формате 2023-12-12 12:00: ");
        String data = sn.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime completionTimePre = LocalDateTime.parse(data, formatter);
        LocalDateTime completionTime = LocalDateTime.now().plusWeeks(1);
        if(LocalDateTime.now().plusHours(1).isBefore(completionTimePre)){
            completionTime = completionTimePre;
        } else {
            System.out.println("Установлен срок выполнения по умолчанию - неделя");
        }
        taskList.add(new Task(author, title, description, priority, completionTime));
    }
    public void showTasks(){
        for (Task t: taskList) {
            System.out.println(t);
        }
    }

}
