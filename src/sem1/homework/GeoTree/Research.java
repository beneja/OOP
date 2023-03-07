package sem1.homework.GeoTree;
import java.util.ArrayList;
import java.util.HashMap;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    HashMap<String,Integer> resultAge = new HashMap<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }
    public HashMap<String,Integer> ageMoreThan(GeoTree g, int age){
        for(Node t: tree) {
            if(t.p1.getAge() > age){
                resultAge.put(t.p1.getFullName(), t.p1.getAge());
            }

        }
        return resultAge;
    }
    public ArrayList<String> isSibling(GeoTree g) {
        for (Node t : tree) {
            if (t.re == Relationship.sibling) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> familyTies(GeoTree g, Person p1, Person p2) {
        for (Node t : tree) {
            System.out.println(t);
        }
        return result;
    }



}