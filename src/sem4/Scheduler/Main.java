package sem4.Scheduler;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author ivan = new Author("Иванов", "Иван","Иванович");
        Scheduler one = new Scheduler(new ArrayList<>());
        one.addTask(ivan);
        System.out.println(ivan);
        one.showTasks();
    }
}
