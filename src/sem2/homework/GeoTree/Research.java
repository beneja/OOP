package sem2.homework.GeoTree;
import java.util.ArrayList;
import java.util.HashMap;

public interface Research {


    ArrayList<String> spend(Person p, Relationship re);
    HashMap<String,Integer> ageMoreThan(GeoTree g, int age);
    ArrayList<String> isSibling(GeoTree g);

    void familyTies(GeoTree g);



}