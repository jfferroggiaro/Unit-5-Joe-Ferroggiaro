public interface Lockable {
    int key = 0;
    Boolean lockStatus = false;

    void setKey(int key);
    void lock(int key);
    void unlock(int key);

    Boolean locked();
}
