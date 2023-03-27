import Products.Computer;
import Products.Laptop;
import Products.Monitor;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private static ProductService instance;

    // Supported types

    private List<Computer> computerList = new ArrayList<>();

    private List<Laptop> laptopList = new ArrayList<>();

    private List<Monitor> monitorList = new ArrayList<>();

    private ProductService() {

    }


    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    public void addComputer(Computer computer){
        computerList.add(computer);
    }


    public void removeComputer(Computer computer){
        computerList.remove(computer);
    }

    public List<Computer> getComputers(){
        return this.computerList;
    }


}
