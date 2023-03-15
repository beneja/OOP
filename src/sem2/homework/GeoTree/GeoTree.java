package sem2.homework.GeoTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class GeoTree implements Research{
    private final ArrayList<Node> tree = new ArrayList<>();

    ArrayList<String> result = new ArrayList<>();
    HashMap<String,Integer> resultAge = new HashMap<>();
//    ArrayList<Node> tree;
//    public ArrayList<Node> getTree() {
//        return tree;
//    }

    public void appendParent(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendSibling(Person sibling1, Person sibling2){
        if(sibling1.getGender() == Gender.woman){
            tree.add(new Node(sibling1, Relationship.sister, sibling2));
        } else {tree.add(new Node(sibling1, Relationship.brother, sibling2));}
    }

    public void findRelatives(Person p){
        for (Node t: tree) {
            if(t.p1.getFullName().equals(p.getFullName())){
                System.out.printf("%s %s %s%n",p.getFullName(), t.re, t.p2.getFullName());
            }
        }
    }

    @Override
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (Objects.equals(t.p1.getFullName(), p.getFullName()) && t.re == re) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    @Override
    public HashMap<String,Integer> ageMoreThan(GeoTree g, int age){
        for(Node t: tree) {
            if(t.p1.getAge() > age){
                resultAge.put(t.p1.getFullName(), t.p1.getAge());
            }

        }
        return resultAge;
    }

    @Override
    public ArrayList<String> isSibling(GeoTree g) {
        for (Node t : tree) {
            if (t.re == Relationship.brother || t.re == Relationship.sister) {
                result.add(t.p2.getFullName());
            }
        }
        return result;
    }

    @Override
    public void familyTies(GeoTree g) {
        for (Node t : tree) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "GeoTree{" +
                "tree=" + tree +
                '}';
    }
}