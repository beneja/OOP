package sem2.homework.catHuman;


import java.util.Comparator;

public class FatigueComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Animal)(o1)).getFatigue() - ((Animal)(o2)).getFatigue(); //??
    }
}