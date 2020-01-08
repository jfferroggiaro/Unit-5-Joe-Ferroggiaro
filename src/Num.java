public class Num {
    private int value;

    public Num(){
        this.value = 0;
    }

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
        return "" + value;
    }

    public Boolean equals(Num otherNum){
        return this.value == otherNum.value;
    }
}
