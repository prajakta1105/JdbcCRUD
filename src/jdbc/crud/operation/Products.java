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
//            String getAllQuery = "select * from products";
//            PreparedStatement pstmt=con.prepareStatement(getAllQuery);
//            ResultSet rs=pstmt.executeQuery();
//
//            System.out.println("Products data: ");
//            while (rs.next()){
//                System.out.println("Product id: "+rs.getInt(1));
//                System.out.println("Product name: "+rs.getString(2));
//                System.out.println("Product price: "+rs.getInt(3));
//                System.out.println("--------------------------------------------");
//            }
//


            //update
//            String updateQuery = "update products set pname = ?, price=? where pid=? ";
//            PreparedStatement pstmt=con.prepareStatement(updateQuery);
//
//            System.out.println("Enter product that want to update: ");
//            int id = sc.nextInt();
//            pstmt.setInt(3,id);
//            sc.nextLine();
//
//            System.out.println("Enter updated product name : ");
//            String updatedName = sc.nextLine();
//            pstmt.setString(1,updatedName);
//
//            System.out.println("Enter updated product price : ");
//            int updatedPrice = sc.nextInt();
//            pstmt.setInt(2,updatedPrice);
//
//            int result=pstmt.executeUpdate();
//            if(result > 0){
//                System.out.println("Data updated successfully");
//            }else {
//                System.out.println("Data is not updated.");
//            }

            //delete
//            String deleteQuery = "delete from products where pid = ?";
//            PreparedStatement pstmt=con.prepareStatement(deleteQuery);
//
//            System.out.println("Enter prosuct id that want to delete: ");
//            int id = sc.nextInt();
//            pstmt.setInt(1,id);
//
//            int result=pstmt.executeUpdate();
//            if(result > 0){
//                System.out.println("Data deleted successfully");
//            }else {
//                System.out.println("Data is not deleted.");
//            }

            //get by id
            String getByIdQuery = "select * from products where pid = ?";
            PreparedStatement pstmt=con.prepareStatement(getByIdQuery);

            System.out.println("Enter product id: ");
            int id = sc.nextInt();
            pstmt.setInt(1,id);

            ResultSet rs=pstmt.executeQuery();
            System.out.println("Product data of pid: "+id);
            while (rs.next()){
                System.out.println("Product name: "+rs.getString(2));
                System.out.println("Product price: "+rs.getInt(3));
            }

            con.close();
            sc.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
