package sem5.CalcZ;

import java.io.FileInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
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
        char preOp = sn.next().charAt(0);
        char[] operations = new char[]{'+','-','*','/'};
        while(!existA(preOp, operations)){
            preOp = sn.next().charAt(0);
            op = preOp;
        } return op;
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
                "5 - Выход",
        };
        int option = 1;
        char op = '.';
        while (option != 5) {
            printMenu(options);
            try {
                option = sn.nextInt();
                switch (option) {
                    case 1 ->{
                         RealNumber n1 = createRealNumber();
                    operands.add(n1);
                        System.out.println(operands.getOperands(0));
                    }
                    case 2 ->{
                        ComplexNumber n2 = createComplexNumber();
                        operands.add(n2);
                        System.out.println(n2);}
                    case 3 -> op = setOp();
                    case 4 -> System.out.println(calc(operands.getOperands(0),operands.getOperands(1),op));
                    case 5 -> exit(0);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                sn.next();
            }
        }

    }
}
