package sem5.CalcZ;

import java.util.ArrayList;

public class Operands <T extends RealNumber>{
    private ArrayList <T> operands;

    public Operands(ArrayList<T> operands) {
        this.operands = operands;
    }

    public T getOperand(int index) {
        return operands.get(index);
    }
    public void add (T r){
        operands.add(r);
    }
    public void remove(int index){
        operands.remove(index);
    }

    @Override
    public String toString() {
        return operands.toString();
    }
}
