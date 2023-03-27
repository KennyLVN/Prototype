package Products;

public class Laptop extends  Products{
private String chipSet;
private String resolution;
private int weight;
private String brandSeries;
private String system;
private String RAM;

private String harddiskType;
private boolean isGraphiccard;
private int ports;
private String batterySize;
private String hertz;
private String screenSize;
private boolean isGaming;
//if gaming:
    private String GPU;





    public Laptop(int price, int UUID, String productNumber, String brand) {
        super(price, UUID, productNumber, brand);
    }
}
