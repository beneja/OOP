package sem1.homework.interactionOfObjects;

public class Wardrobe {

    public String[] storageShelf; //полки
    private boolean doorOpen; //состояние дверки

    private String shelf; //полка

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getStorageShelf(int index) {

        if(!isDoorOpen()) return null;
        if(index >= storageShelf.length) return null;
        String storage = storageShelf[index];

        return storage;
    }

    public void setStorageShelf(String storageShelf, int index) {
        if(isDoorOpen()) {
            this.storageShelf[index] = storageShelf;
        }
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

//    public Wardrobe(String[]wardrobe){
//        this.storageShelf = setStorageShelf(storageShelf, int index);
//    }
}
