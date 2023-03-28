import Products.Computer;
import Products.Laptop;
import Products.Monitor;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class Scanner {
    static Connection connection = null;

    public static void read() {
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
                    "INSERT INTO Products(Product name, Price, Brand, uuid, Product Number, Category ID) VALUES (?,?,?,?,?,?)"

            );

            insertStatement.setString(1, ""); //sætter input her ind i VALUES plads 1
            insertStatement.setString(2, "");//sætter input her ind i VALUES plads 2
            insertStatement.setString(3, "");
            insertStatement.setString(4, "");
            insertStatement.setString(5, "");
            insertStatement.setString(6, "");


            insertStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Query Database
        try {

            PreparedStatement queryStatement = connection.prepareStatement("SELECT * FROM PRODUCTS WHERE UUID = ?");
            queryStatement.setString(1, "");
            ResultSet result = queryStatement.executeQuery();

            while(result.next()){


                int product = result.getInt("Product");
                String product_name = result.getString("Product name");
                int price = result.getInt("Price");
                String brand = result.getString("Brand");
                int uuid = result.getInt("uuid");
                String product_number = result.getString("Product Number");
                int category_id = result.getInt("Category ID");

                switch (category_id){
                   // case 1: Computer computer = new Computer(price,uuid, product_number, brand );
                   // case 2: Laptop laptop = new Laptop();
                    //case 3: Monitor monitor = new Monitor();

                }



        }
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insert(){

    }
}