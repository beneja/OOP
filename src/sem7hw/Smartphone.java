package sem7hw;

import java.util.Scanner;
import java.util.UUID;

import static sem7hw.Verifications.isDigit;

public class Smartphone extends Phone implements InternalStorage{
    private Scanner sn = new Scanner(System.in);
    private final UUID id;
    public Smartphone(String brand, String model, Microphone micro, Speaker speaker) {
        super(brand, model, micro, speaker);
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    @Override
    public void call() {
        System.out.println("Введите номер: ");
        String str = sn.next();
        if(isDigit(str)){
            System.out.println("Совершаю звонок");
        } else {
            System.out.println("Попробуйте ещё раз");
        }
    }

    @Override
    public void receiveCall() {
        System.out.println("Звонок принят");
    }

    @Override
    public void saveData(Object data) {
        System.out.println("Проверка области памяти, размера файла. Запись. готово");
    }

    @Override
    public Object loadData(int index) {
        System.out.println("Данные по индексу " + index);
        return hashCode();
    }
}
