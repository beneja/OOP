package sem5.CalcZ;


public class ComplexNumber extends RealNumber{

    private double Im;

    public ComplexNumber(double re, double im) {

        super(re);//&????
        this.Im = im;
    }

    public double getIm() {
        return Im;
    }

    public void setIm(double im) {
        this.Im = im;
    }


    @Override
    public String toString() {
        return String.format("%s + %si", getRe(), Im);
    }
//    public boolean isComplex(){
//
//    }
}
