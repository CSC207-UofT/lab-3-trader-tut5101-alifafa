public class Duck implements Domesticatable, Tradable {
    @Override
    public String sound() {
        return "quack";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
