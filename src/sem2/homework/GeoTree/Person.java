package sem2.homework.GeoTree;
public class Person {
    private String fullName;
    Gender gender;
    private int age;



    public Person(String fullName, Gender gender, int age) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
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