package sem6.homework;

import java.util.Scanner;

public class ChoiceCalculator {
    static Scanner snc = new Scanner(System.in);
    public static void choice(){
        System.out.println("""
                Выберите тип калькулятора с которых хотите работать:
                 1 - рациональный
                 2 - комплексный""");
        String cc = "";
        while (!("1".equals(cc)||"2".equals(cc))){
            cc = snc.next();
        }
        if(cc.equals("1")){
            PresenterRational p = new PresenterRational(new View(), new RationalNumbersCalculation());
            p.start();
        } else {
            PresenterComplex pc = new PresenterComplex(new View(), new ComplexNumbersCalculation());
            pc.startComplex();
        }
    }
}
