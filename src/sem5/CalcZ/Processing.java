package sem5.CalcZ;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.StringTokenizer;

import static sem5.CalcZ.Main.sn;

public class Processing {

    public static ComplexNumber createComplexNumber() throws ParseException {

        System.out.println("Введите комплексное число в алгебраической форме:");
        String str = sn.nextLine();
        str = str.replaceAll("\\s+", "");
        System.out.println(str);
        double[] arr = parseComplexNumber(str);
        return new ComplexNumber(arr[0], arr[1]);
    }

    public boolean isComplex(String str) {
        return str.charAt(str.length() - 1) == 'i';
    }

    public static double[] parseComplexNumber(String str)
            throws ParseException {
        double[] arr = new double[2];
        StringTokenizer st = new StringTokenizer(str, "+-", true);
        String previousToken = "";
        String currentToken = "";
        String numb = "";
        double Re = 0;
        double Im = 0;
        NumberFormat nf = NumberFormat.getInstance();
        while (st.hasMoreTokens()) {
            currentToken = st.nextToken();
            if (previousToken.equals("-"))
                numb = previousToken + currentToken;
            else
                numb = currentToken;
            if (!numb.equals("+") && !numb.equals("-")) {
                if (numb.indexOf('i') == -1)
                    Re = nf.parse(numb).doubleValue();

                else {
                    numb = numb.replace('i', ' ');
                    if (numb.equals(" "))
                        numb = "1";
                    if (numb.equals("- "))
                        numb = "-1";
                    Im = nf.parse(numb).doubleValue();
                }
            }
            previousToken = currentToken;
        }
        arr[0] = Re;
        arr[1] = Im;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static RealNumber createRealNumber(){
        System.out.println("Введите число:");
        //action.add( new RealNumber(sn.nextDouble()));
        return new RealNumber(sn.nextDouble());
    }
}
