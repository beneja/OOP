package sem1.homework.GeoTree;
import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendSibling(Person sibling1, Person sibling2){
        tree.add(new Node(sibling1, Relationship.sibling, sibling2));
    }

    @Override
    public String toString() {
        return "GeoTree{" +
                "tree=" + tree +
                '}';
    }
}