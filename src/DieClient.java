public class DieClient {
    public static void main(String[] args) {
        Die die = new Die(69);

        die.roll();
        System.out.println(die.getSide());

        die.lock(69);
        die.unlock(68);
        die.unlock(69);

        die.roll();
        System.out.println();



    }
}
