package jdbc.crud.operation;

import java.sql.*;
import java.util.Scanner;

public class Teacher {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner sc = new Scanner(System.in);
         String url = "jdbc:mysql://localhost:3306/student";
         String username="root";
         String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class loaded successfully...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
           Connection con = DriverManager.getConnection(url,username,password);

           //insert
//           String insertQuery = "insert into faculty(id,name,age) values(?,?,?)";
//           PreparedStatement pstmt =con.prepareStatement(insertQuery);
//            System.out.println("Enter id: ");
//            int id = sc.nextInt();
//            pstmt.setInt(1,id);
//
//            sc.nextLine();
//            System.out.println("Enter name: ");
//            String name = sc.nextLine();
//            pstmt.setString(2,name);
//
//            System.out.println("Enter age: ");
//            int age = sc.nextInt();
//            pstmt.setInt(3,age);
//
//            int row=pstmt.executeUpdate();
//
//            if(row != 0){
//                System.out.println("Data inserted successfully...");
//            }


            //get all
//            String getAll = "select * from faculty";
//            PreparedStatement pstmt=con.prepareStatement(getAll);
//            ResultSet rs =pstmt.executeQuery();
//
//            while (rs.next()){
//
//                System.out.println("Id: "+rs.getInt("id"));
//                System.out.println("Name: "+rs.getString("name"));
//                System.out.println("Age: "+rs.getInt("age"));
//                System.out.println("------------------------------------------------------");
//            }

            //get by id
//            String getById = "Select * from faculty where id = ?";
//            PreparedStatement pstmt=con.prepareStatement(getById);
//            System.out.println("Enter id: ");
//            int id = sc.nextInt();
//
//            pstmt.setInt(1,id);
//            ResultSet rs= pstmt.executeQuery();
//            if(rs.next()){
//                System.out.println("Teacher data of id "+id);
//                System.out.println("name: "+rs.getString("name"));
//                System.out.println("age: "+rs.getInt("age"));
//            }else{
//                System.out.println("The faculty with id "+id+" is not present.");
//            }

            //update
//            String updateQuery= "update faculty set name = ?, age=? where id = ?";
//            PreparedStatement pstmt=con.prepareStatement(updateQuery);
//
//            System.out.println("Enter id which faculty details want to update: ");
//            int id = sc.nextInt();
//            pstmt.setInt(3,id);
//
//            sc.nextLine();
//            System.out.println("Enter name: ");
//            String name = sc.nextLine();
//            pstmt.setString(1,name);
//
//            System.out.println("Enter age: ");
//            int age = sc.nextInt();
//            pstmt.setInt(2,age);
//
//            int row=pstmt.executeUpdate();
//            if(row != 0){
//                System.out.println("Data updated successfully.");
//            }else{
//                System.out.println("Data not updated.");
//            }

            //delete
            String delete = "delete from faculty where id = ?";
            PreparedStatement pstmt=con.prepareStatement(delete);
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            pstmt.setInt(1,id);
            int row=pstmt.executeUpdate();

            if(row !=0){
                System.out.println("Data deleted successfully.");
            }else {
                System.out.println("Data is not deleted.");
            }

            con.close();
            sc.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
