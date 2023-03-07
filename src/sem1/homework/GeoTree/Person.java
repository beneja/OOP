package sem1.homework.GeoTree;
public class Person {
    private String fullName;

    private int age;

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return String.format("<%s, %d>", fullName, age);
    }
}