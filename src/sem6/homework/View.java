package sem6.homework;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s: ", title);
        return in.nextDouble();
    }

    public void print(double data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
    public void printComplex(ComplexNumbers complex, String title){
        System.out.printf(title + " %s+%si",complex.getX(),complex.getY());
    }
}
