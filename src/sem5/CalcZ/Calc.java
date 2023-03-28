package sem5.CalcZ;

public class Calc {
    public static ComplexNumber calc1(ComplexNumber n1, ComplexNumber n2, char operation) {
        if (operation == '+') {
            return new ComplexNumber(n1.getRe() + n2.getRe(), n1.getIm() + n2.getIm());
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe() - n2.getRe(), n1.getIm() - n2.getIm());
        } else if (operation == '*') {
            return new ComplexNumber(n1.getRe() * n2.getRe() - n1.getIm() * n2.getIm(),
                    n1.getRe() * n2.getIm() + n1.getRe() * n1.getIm());
        } else
            return new ComplexNumber((n1.getRe() * n2.getRe() + n1.getIm() * n2.getIm()) /
                    ((n2.getRe() * n2.getRe()) + (n2.getIm() * n2.getIm())),
                    (n1.getIm() * n2.getRe() - n1.getRe() * n2.getIm()) /
                            (n2.getRe() * n2.getRe()) + (n2.getIm() * n2.getIm()));

    }

    public static ComplexNumber calc2(ComplexNumber n1, RealNumber n2, char operation) {
        if (operation == '+') {
            return new ComplexNumber(n1.getRe() + n2.getRe(), n1.getIm());
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe() - n2.getRe(), n1.getIm());
        } else if (operation == '*') {
            return new ComplexNumber(n1.getRe() * n2.getRe(), n1.getIm() * n2.getRe());
        } else
            return new ComplexNumber(n1.getRe() / n2.getRe(), n1.getIm() / n2.getRe());

    }

    public static ComplexNumber calc3(RealNumber n1, ComplexNumber n2, char operation) {
        if (operation == '+') {
            return calc2(n2,n1,operation);
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe()-n2.getRe(), n2.getIm() );
        } else if (operation == '*') {
            return new ComplexNumber((n1.getRe() * n2.getRe()), (n1.getRe()) * n2.getIm());
        } else
            return new ComplexNumber(n1.getRe()/ n2.getRe(), n1.getRe()/ n2.getIm());

    }
    public static RealNumber calc4(RealNumber n1, RealNumber n2, char operation){
        if(operation == '+'){
            return new RealNumber(n1.getRe() + n2.getRe());
        } else if(operation == '-'){
            return new RealNumber(n1.getRe() - n2.getRe());
        } else if(operation == '*'){
            return new RealNumber(n1.getRe() * n2.getRe());
        } else return new RealNumber(n1.getRe() / n2.getRe()); //?!?!
    }
}
