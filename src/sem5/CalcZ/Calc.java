package sem5.CalcZ;

public class Calc {
    public static ComplexNumber calc(ComplexNumber n1, ComplexNumber n2, char operation) {
        if (operation == '+') {
            return new ComplexNumber(n1.getRe() + n2.getRe(), n1.getIm() + n2.getIm());
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe() - n2.getRe(), n1.getIm() - n2.getIm());
        } else if (operation == '*') {
            return new ComplexNumber(n1.getRe() * n2.getRe() - n1.getIm() * n2.getIm(),
                    n1.getRe() * n2.getIm() + n1.getRe() * n1.getIm());
        } else if (operation == '/') {
            return new ComplexNumber((n1.getRe() * n2.getRe() + n1.getIm() * n2.getIm()) /
                    ((n2.getRe() * n2.getRe()) + (n2.getIm() * n2.getIm())),
                    (n1.getIm() * n2.getRe() - n1.getRe() * n2.getIm()) /
                            (n2.getRe() * n2.getRe()) + (n2.getIm() * n2.getIm()));
        } else return null;
    }

    public static ComplexNumber calc(ComplexNumber n1, RealNumber n2, char operation) {
        if (operation == '+') {
            return new ComplexNumber(n1.getRe() + n2.getRe(), n1.getIm());
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe() - n2.getRe(), n1.getIm());
        } else if (operation == '*') {
            return new ComplexNumber(n1.getRe() * n2.getRe(), n1.getIm() * n2.getRe());
        } else if (operation == '/') {
            return new ComplexNumber(n1.getRe() / n2.getRe(), n1.getIm() / n2.getRe());
        } else return null;
    }

    public static ComplexNumber calc(RealNumber n1, ComplexNumber n2, char operation) {
        if (operation == '+') {
            return calc(n2,n1,operation);
        } else if (operation == '-') {
            return new ComplexNumber(n1.getRe()-n2.getRe(), n2.getIm() );
        } else if (operation == '*') {
            return new ComplexNumber((n1.getRe() * n2.getRe()), (n1.getRe()) * n2.getIm());
        } else if (operation == '/') {
            return new ComplexNumber(n1.getRe()/ n2.getRe(), n1.getRe()/ n2.getIm());
        } else return null;
    }
    public static double calc(RealNumber n1, RealNumber n2, char operation){
        if(operation == '+'){
            return n1.getRe() + n2.getRe();
        } else if(operation == '-'){
            return n1.getRe() - n2.getRe();
        } else if(operation == '*'){
            return n1.getRe() * n2.getRe();
        } else return n1.getRe() / n2.getRe(); //?!?!
    }
}
