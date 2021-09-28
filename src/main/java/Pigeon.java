public class Pigeon implements Tradable, Domesticatable {
    private double weight;

    public Pigeon(double weight){
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public String sound() {
        return "woo";
    }

    public double getWeight() {
        return weight;
    }
}

