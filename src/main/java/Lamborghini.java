public class Lamborghini implements Drivable, Tradable {
    private int max_speed;

    public Lamborghini() {
        this.max_speed = 10;
    }
    @Override
    public void upgradeSpeed() {
        this.max_speed ++;
    }

    @Override
    public void downgradeSpeed() {
        this.max_speed --;
    }

    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
