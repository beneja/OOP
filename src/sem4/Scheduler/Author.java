package sem4.Scheduler;

public class Author {
    private String surname;
    private String name;
    private String middleName;


    public Author(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s", surname, name, middleName);
    }
}
