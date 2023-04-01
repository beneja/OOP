package sem6.homework;

public class PresenterComplex {
    ComplexNumbersCalculation cnc;
    View view;


    public PresenterComplex(View v, ComplexNumbersCalculation c) {
        view = v;
        cnc = c;
    }

    public void startComplex() {
        System.out.println("первое число");
        cnc.setX(view.getValue("действительная часть"));
        cnc.setY(view.getValue("мнимая часть"));
        System.out.println("второе число");
        cnc.setA(view.getValue("действительная часть"));
        cnc.setB(view.getValue("мнимая часть"));
        char operation = Operation.setOp();
        if (operation == '+') {
            view.printComplex(cnc.sum(), "сумма");
        } else if (operation == '-') {
            view.printComplex(cnc.diff(), "Разница");
        } else if (operation == '*') {
            view.printComplex(cnc.multiply(), "Произведение");
        } else view.printComplex(cnc.div(), "Частное");
    }
}
