package sem6.homework;

import java.util.Scanner;

public class Operation {
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
}
