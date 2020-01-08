public class Num {
    private int value;

    public Num(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String valString;
        valString += value;
        return valString;
    }
}
