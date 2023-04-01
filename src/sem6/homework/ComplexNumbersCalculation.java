package sem6.homework;

public class ComplexNumbersCalculation extends GeneralNumberDescriptor
        implements Model<ComplexNumbers> {
    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((getX() + getA()), (getY() + getB()));
    }

    @Override
    public ComplexNumbers diff() {
        return new ComplexNumbers((getX() - getA()), (getY() - getB()));
    }

    @Override
    public ComplexNumbers multiply() {
        return new ComplexNumbers(((getX() * getA()) - (getY() * getB())), ((getY() * getA()) +
                (getB() * getX())));
    }

    @Override
    public ComplexNumbers div() {
        return new
                ComplexNumbers(((Double) ((getX() * getA()) - (getY() * getB()))) /
                ((Double) (Math.pow(getA(), 2) + Math.pow(getB(), 2))),
                ((Double) ((getX() * getB()) + (getA() * getY()))) /
                        ((Double) (Math.pow(getA(), 2) + Math.pow(getB(), 2))));
    }
}
