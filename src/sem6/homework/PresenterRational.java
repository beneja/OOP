package sem6.homework;


public class PresenterRational {
    RationalNumbersCalculation rnc;
    View view;


    public PresenterRational(View v, RationalNumbersCalculation r) {
        view = v;
        rnc = r;
    }

    public void start() {
        rnc.setX(view.getValue("a"));
        rnc.setY(view.getValue("b"));
        char operation = Operation.setOp();
        if (operation == '+') {
            view.print(rnc.sum(), "сумма");
        } else if (operation == '-') {
            view.print(rnc.diff(), "Разница");
        } else if (operation == '*') {
            view.print(rnc.multiply(), "Произведение");
        } else view.print(rnc.div(), "Частное");
    }

}
