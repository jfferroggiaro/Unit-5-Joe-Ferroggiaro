public class Die implements Lockable{
    private int side;
    private int key = 0;
    private boolean lockStatus = false;

    public Die(int key){
        this.key = key;
        roll();
    }

    public void roll(){
        if(!locked()) {
            this.side = (int) (Math.random() * 6 + 1);
            System.out.println("Rolling...");
        } else {
            System.out.println("Cannot roll while die is locked.");
        }
    }

    public int getSide() {
        return side;
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void lock(int key) {
        System.out.println("Locking with key " + key + "...");
        if(this.key == key){
            lockStatus = true;
            System.out.println("Locking successful.");
        } else {
            System.out.println("Locking unsuccessful: incorrect key.");
        }

    }

    @Override
    public void unlock(int key) {
        System.out.println("Unlocking with key" + key + "...");
        if(this.key == key){
            lockStatus = false;
            System.out.println("Unlocking successful.");
        } else {
            System.out.println("Unlocking unsuccessful: incorrect key.");
        }
    }

    @Override
    public boolean locked() {
        return lockStatus;
    }
}
