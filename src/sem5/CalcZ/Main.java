package sem5.CalcZ;

import java.io.FileInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.lang.System.exit;
import static sem5.CalcZ.Processing.*;
import static sem5.CalcZ.Calc.*;


public class Main {
    public static Scanner sn = new Scanner(System.in);
    static char op;
    static Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Выберите: ");
    }
    public static char setOp(){
        System.out.println("Выберите операцию: + - * /");
        char op = '.';
        char[] operations = new char[]{'+','-','*','/'};
        while(!existA(op, operations)){
            Scanner sn = new Scanner(System.in);
            op = sn.next().charAt(0);

        }return op;

    }
    private static boolean existA(char a, char[]ops){
        for (char op: ops) {
            if (a == op){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ParseException {
        Scanner sn = new Scanner(System.in);
        Operands<RealNumber> operands = new Operands<>(new ArrayList<>());
        String[] options = {"1 - Задать рациональное число",
                "2 - Задать комплексное число",
                "3 - Задать действие",
                "4 - Равно",
                "5 - Показать операнды",
                "6 - Удалить операнды",
                "7 - Выход",
        };
        int option = 1;
        char op = '.';
        while (option != 7) {
            printMenu(options);
            try {
                option = sn.nextInt();
                switch (option) {
                    case 1 ->{
                         RealNumber n1 = createRealNumber();
                    operands.add( n1);
                        LOGGER.log(Level.INFO,"Задано рациональное число " + n1);
                        System.out.println(n1);
                    }
                    case 2 ->{
                        ComplexNumber n2 = createComplexNumber();
                        operands.add(n2);
                        LOGGER.log(Level.INFO,"Задано комплексное число " + n2);
                        System.out.println(n2);}
                    case 3 -> {op = setOp();
                        LOGGER.log(Level.INFO,"Задано действие " + op);
                        System.out.println(op);}
                    case 4 ->
                    { if((operands.getOperand(0).getClass().isInstance(new ComplexNumber(1,1))) &&
                            (operands.getOperand(1).getClass().isInstance(new ComplexNumber(1,1)))){
                        System.out.println(calc1((ComplexNumber) operands.getOperand(0), (ComplexNumber) operands.getOperand(0),op));      //не забирает комплексные числа
                    } else if ((operands.getOperand(0).getClass().isInstance(new ComplexNumber(1,1))) &&
                            (operands.getOperand(1).getClass().isInstance(new RealNumber(1)))) {
                        System.out.println(calc2((ComplexNumber) operands.getOperand(0),operands.getOperand(1),op));       //не забирает комплексные числа
                    } else if ((operands.getOperand(0).getClass().isInstance(new RealNumber(1))) &&
                            (operands.getOperand(1).getClass().isInstance(new ComplexNumber(1,1)))) {
                        System.out.println(calc3(operands.getOperand(0), (ComplexNumber) operands.getOperand(1),op));       //не забирает комплексные числа
                    } else System.out.println(calc4(operands.getOperand(0),operands.getOperand(1),op));}

                    case 5 -> {System.out.println(operands);
                    LOGGER.log(Level.INFO,"Вывод операндов " + operands);}
                    case 6 -> {operands.remove(0);
                               operands.remove(1);
                        LOGGER.log(Level.INFO,"Операнды удалены");}
                    case 7 -> exit(0);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                sn.next();
            }
        }

    }
}
