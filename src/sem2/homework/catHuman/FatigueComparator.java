package sem2.homework.catHuman;


import java.util.Comparator;

public class FatigueComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getFatigue() - o2.getFatigue();
    }
}