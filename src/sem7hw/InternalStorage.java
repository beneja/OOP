package sem7hw;

public interface InternalStorage {
    void saveData(Object data);
    Object loadData(int index);
}
