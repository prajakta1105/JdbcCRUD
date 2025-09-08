package jdbc.crud.operation;

import java.sql.*;
import java.util.Scanner;

public class Products {
    private static String url = "jdbc:mysql://localhost:3306/student";
    private static String username = "root";
    private static String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Loaded Successfully.....");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try{
            Connection con =DriverManager.getConnection(url,username,password);

            //Insert Dara Using statement
//            Statement stmt =con.createStatement();
//            String insertQuery = "insert into products(pid,pname,price) values(1,'Mobile',24000)";
//            int result =stmt.executeUpdate(insertQuery);
//            if(result > 0){
//                System.out.println("Data inserted successfully");
//            }else {
//                System.out.println("Data is not inserted.");
//            }

              //insert - using preparedStatement
//              String insertQuery = "insert into products(pid,pname,price) values(?,?,?)";
//              PreparedStatement pstmt =con.prepareStatement(insertQuery);
//
//              System.out.println("Enter product id: ");
//              int id = sc.nextInt();
//              pstmt.setInt(1,id);
//              sc.nextLine();
//
//             System.out.println("Enter product name: ");
//             String name = sc.nextLine();
//             pstmt.setString(2,name);
//
//            System.out.println("Enter product price: ");
//            int price = sc.nextInt();
//            pstmt.setInt(3,price);
//
//            int result =pstmt.executeUpdate();
//            if(result > 0){
//                System.out.println("Data inserted successfully");
//            }else {
//                System.out.println("Data is not inserted.");
//            }

            //get All
            String getAllQuery = "select * from products";
            PreparedStatement pstmt=con.prepareStatement(getAllQuery);
            ResultSet rs=pstmt.executeQuery();

            System.out.println("Products data: ");
            while (rs.next()){
                System.out.println("Product id: "+rs.getInt(1));
                System.out.println("Product name: "+rs.getString(2));
                System.out.println("Product price: "+rs.getInt(3));
                System.out.println("--------------------------------------------");
            }

            con.close();
            sc.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
