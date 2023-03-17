package sem4.Scheduler;


import java.time.LocalDateTime;

public class Task extends DataForm implements Comparable<Task> {
    private final Author author;
    private String title;
    private String description;
    private Priority priority;
    private final LocalDateTime timeCreate;
    private LocalDateTime completionTime;

    public Task(Author author, String title, String description, Priority priority,
                LocalDateTime completionTime) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.timeCreate = LocalDateTime.now();
        this.completionTime = completionTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDateTime getTimeCreate() {
        return timeCreate;
    }

    @Override
    public String toString() {
        String result = "";
        result += String.format("Автор: %s\n" +
                        "Время создания: %s\n" +
                        "Заголовок: %s\n" +
                        "Описание: %s\n" +
                        "Дедлайн: %s\n", this.author, normalizedData(this.timeCreate), this.title,
                this.description, normalizedData(this.completionTime));


        return result;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Task t) {
        if (t.getCompletionTime().isEqual(this.getCompletionTime())) {
            return 0;
        }
        if (t.getCompletionTime().isBefore(this.getCompletionTime())) {
            return -1;
        } else {
            return 1;
        }
    }

}
