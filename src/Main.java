import Products.Computer;
import Products.Laptop;
import Products.Monitor;

import java.sql.*;

import static javax.swing.UIManager.getInt;

public class Main {



    static Connection connection = null;
    public static void main(String[] args) {


        //connection to database
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/prototype",
                             "postgres",
                                "bgx97wxq");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //insert products here:
        try {
            PreparedStatement insertStatement = connection.prepareStatement(
                    "INSERT INTO Products(Product name, Price, Brand, uuid, Product Number, Category ID) VALUES (?,?)"
                                                );

            insertStatement.setString(1,""); //sætter input her ind i VALUES plads 1
            insertStatement.setString(2,"");//sætter input her ind i VALUES plads 2
            insertStatement.setString(3,"");
            insertStatement.setString(4,"");
            insertStatement.setString(5,"");
            insertStatement.setString(6,"");


            insertStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Query Database
        try {

            PreparedStatement queryStatement = connection.prepareStatement("SELECT * FROM PRODUCTS WHERE UUID = ?");
            queryStatement.setString(1,"");
            ResultSet result = queryStatement.executeQuery();

            while(result.next()){


                  int column1 = result.getInt("Product");
                   String column2 = result.getString("Product name");
                    int column3 = result.getInt("Price");
                    String column4 = result.getString("Brand");
                    int column5 = result.getInt("uuid");
                    String column6 = result.getString("Product Number");
                    int column7 = result.getInt("Category ID");



                }




        } catch (SQLException e) {
            e.printStackTrace();
        }

// laptop = catergory id 1, computer = 2, monitor = 3




    //add    data to list computer
       // ProductService.getInstance().addComputer(myComputer);


    }
}