public class Die implements Lockable{
    private int side;
    private int key = 0;
    private Boolean lockStatus;

    public Die(){
        this.side = 0;
    }


    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void lock(int key) {
        if(this.key == key){
            lockStatus = true;
        }
    }

    @Override
    public void unlock(int key) {
        if(this.key == key){
            lockStatus = false;
        }
    }

    @Override
    public Boolean locked() {
        return lockStatus;
    }
}
