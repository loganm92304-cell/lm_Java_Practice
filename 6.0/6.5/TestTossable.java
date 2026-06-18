public class TestTossable {

    public static void main(String[] args) {

        Rock rock = new Rock();

        Baseball baseball =
                new Baseball("Rawlings");

        Football football =
                new Football("Spalding");

        rock.toss();

        baseball.toss();
        baseball.bounce();

        football.toss();
        football.bounce();

        System.out.println(
                baseball.getBrandName());

        System.out.println(
                football.getBrandName());
    }
}