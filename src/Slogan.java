public class Slogan {

    private String text;
    private static int count = 0;

    public Slogan(String text){
        this.text = text;
        count++;
    }

    @Override
    public String toString() {
        return (text);
    }

    public static int getCount() {
        return count;
    }
}
