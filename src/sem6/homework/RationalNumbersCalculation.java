package sem6.homework;
public class RationalNumbersCalculation extends GeneralNumberDescriptor
    implements Model<Double> {
    @Override
    public Double sum() {
        return getX() + getY();
    }

    @Override
    public Double diff() {
        return getX() - getY();
    }

    @Override
    public Double multiply() {
        return getX() * getY();
    }

    @Override
    public Double div() {
        return getX() / getY();
    }
}
