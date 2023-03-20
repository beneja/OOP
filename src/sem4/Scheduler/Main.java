package sem4.Scheduler;

import java.util.Scanner;

import static java.lang.System.exit;


public class Main {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Выберите: ");
    }

    private static Author createAuthor() {

        System.out.println("Ввeдите ФИО через пробел: ");
        Scanner sn = new Scanner(System.in);
        String FIO = sn.nextLine();
        String[] fio = FIO.split(" ");
        return new Author(fio[0], fio[1], fio[2]);

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Создание пользователя: ");
        Author author = createAuthor();
        Scheduler scheduler = new Scheduler();
        String[] options = {"1- Добавить задачу",
                "2- Завершить задачу",
                "3- Показать список задач",
                "4- Сортировать по приближению дедлайна",
                "5- Выход",
        };
        int option = 1;
        while (option != 5) {
            printMenu(options);
            try {
                option = sn.nextInt();
                switch (option) {
                    case 1 -> scheduler.addTask(author);
                    case 2 -> scheduler.completeTask();
                    case 3 -> scheduler.showTasks();
                    case 4 -> scheduler.showSortedByCompletionTime();
                    case 5 -> exit(0);
                }


            } catch (Exception ex) {
                System.out.println("Введите значение от 1 до " + options.length);
                sn.next();
            }
        }
    }
}