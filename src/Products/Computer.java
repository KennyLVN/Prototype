package Products;

public class Computer extends Products {
private String RAM;
private String harddiskType;
private boolean isGraphiccard;
private boolean isGaming;
private String CPU;
private String GPU;
private String System;
private String brandSeries;
private int ports;
private String batteriSize;

    public Computer(
            int price,
            int UUID,
            int productNumber,
            String brand,
            String RAM,
            String harddiskType,
            Boolean isGraphiccard,
            Boolean isGaming,
            String CPU,
            String GPU,
            String System,
            String brandSeries,
            int ports,
            String batteriSize
    ) {

        super(price, UUID, productNumber, brand);

        this.RAM = RAM;
        this.harddiskType = harddiskType;
        this.isGraphiccard = isGraphiccard;
        this.isGaming = isGaming;
        this.CPU = CPU;
        this.GPU = GPU;
        this.System = System;
        this.brandSeries = brandSeries;
        this.ports = ports;
        this.batteriSize = batteriSize;
    }
}
