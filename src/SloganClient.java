public class SloganClient {
    public static void main(String[] args) {
        Slogan s1 = new Slogan("joe mama");
        Slogan s2 = new Slogan("Nolan.");
        Slogan s3 = new Slogan("PRESIDENTIAL HARASSMENT!");
        Slogan s4 = new Slogan("Thank you Kanye, very cool!");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println("Total Slogans: " + s1.getCount());
    }
}
