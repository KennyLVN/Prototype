package Products;

public class Monitor extends Products {

    private int screenSize;
    private int screenHertz;
    private String portType;

    public Monitor(int price, int UUID, String productNumber, String brand, int screenSize, int screenHertz, String portType) {
        super(price, UUID, productNumber, brand);
        this.screenSize = screenSize;
        this.portType = portType;
        this.screenHertz = screenHertz;

    }

}