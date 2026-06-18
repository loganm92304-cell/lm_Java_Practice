public class Football extends Ball {

    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Football is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println("Football bounces.");
    }
}