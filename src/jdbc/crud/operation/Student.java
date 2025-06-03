package jdbc.crud.operation;

import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
           Connection con =  DriverManager.getConnection(url,username,password);

           //insert operation using statement
//            Statement stmt =  con.createStatement();
//           String insertQuery = "insert into studentDetails (rollNo,name,age) values(1,'Pratik',21)";
//           int rows = stmt.executeUpdate(insertQuery);
//            System.out.println(rows+" iserted successfully");


            //insert operation using preparedStatement
//            String insertQuery2 = "insert into studentDetails (rollNo,name,age) values(?,?,?); ";
//            PreparedStatement pstmt =  con.prepareStatement(insertQuery2);
//            System.out.println("Enter roll no: ");
//            int rollNo = sc.nextInt();
//            sc.nextLine();
//            pstmt.setInt(1,rollNo);
//
//
//            System.out.println("Enter name : ");
//            String name = sc.nextLine();
//            pstmt.setString(2,name);
//
//            System.out.println("Enter age: ");
//            int age = sc.nextInt();
//            pstmt.setInt(3,age);
//
//            int row = pstmt.executeUpdate();
//            System.out.println(row+" iserted successfully");


            //Update operation
//            String updateQuery = "update studentDetails set name = ? where rollNo = ? ;";
//            PreparedStatement pstmt = con.prepareStatement(updateQuery);
//            System.out.println("Enter updated name : ");
//            String name = sc.nextLine();
//            pstmt.setString(1,name);
//
//            System.out.println("Enter rollNo : ");
//            int rollNo = sc.nextInt();
//            pstmt.setInt(2,rollNo);
//
//            int rowsAffected = pstmt.executeUpdate();
//            System.out.println(rowsAffected+" updated successfully");

            //Select operation
//            String selectQuery = "select * from studentDetails;";
//            PreparedStatement pstmt = con.prepareStatement(selectQuery);
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()){
//                System.out.println("----------------------------------------------------------");
//                System.out.println("Roll no: "+rs.getInt("rollNo"));;
//                System.out.println("Name: "+rs.getString("name"));;
//                System.out.println("Age: "+rs.getInt("age"));;
//            }

            //delete operation
            String deleteQuery = "delete from studentDetails where rollNo = ?;";
            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            System.out.println("Enter roll no that record want to delete: ");
            int rollNo = sc.nextInt();
            pstmt.setInt(1,rollNo);

            int rowDeleted = pstmt.executeUpdate();
            System.out.println(rowDeleted+" record deleted successfully.");



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
