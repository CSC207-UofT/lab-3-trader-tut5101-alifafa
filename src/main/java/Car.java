public class Car implements Drivable, Tradable {
    public int price;
    private int speed;

    public Car(){
        this.price = 100;
        this.speed = 50;
    }

    //This is a bad documentation.
    @Override
    public void upgradeSpeed() {
        this.speed += 10;
    }

    @Override
    public void downgradeSpeed() {this.speed -= 1;}


    @Override
    public int getMaxSpeed() {return this.speed;}

    @Override
    public int getPrice() {return this.price;}

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Price: " + this.price +")";
    }


}
