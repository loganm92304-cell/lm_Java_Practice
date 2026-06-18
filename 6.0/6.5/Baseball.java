public class Baseball extends Ball {

    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Baseball is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println("Baseball bounces.");
    }
}