package sem5.CalcZ;

public class RealNumber {
    private double Re;

    public double getRe() {
        return Re;
    }

    public void setRe(double re) {
        Re = re;
    }

    public RealNumber(double re) {
        Re = re;
    }

    @Override
    public String toString() {
        return String.format("%s",Re);
    }
}
