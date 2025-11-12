package jdbc.crud.operation;

import java.sql.*;
import java.util.Scanner;

public class Employee {
    private static String url = "jdbc:mysql://localhost:3306/student";
    private static String username ="root";
    private static String password ="root";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class loaded successfully...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
             Connection con =DriverManager.getConnection(url, username, password);
             System.out.println("Connection established successfully...");

             //statement
//            Statement statement =con.createStatement();
//            String insertQuery = "insert into employee(eid,ename,salary,dept) values(1,'Pratik',45000,'Dev')";
//            int result=statement.executeUpdate(insertQuery);
//
//            if(result != 0){
//                System.out.println("Record added successfully....");
//            }else {
//                System.out.println("Data is not added");
//            }

            //preparedstatement
//            String insertQuery = "insert into employee(eid,ename,salary,dept) values(?,?,?,?)";
//            PreparedStatement preparedStatement =con.prepareStatement(insertQuery);
//
//            System.out.println("Enter Data: ");
//
//            System.out.println("Enter employee id: ");
//            int eid = sc.nextInt();
//            preparedStatement.setInt(1,eid);
//            sc.nextLine();
//
//            System.out.println("Enter employee name: ");
//            String ename = sc.nextLine();
//            preparedStatement.setString(2,ename);
//
//            System.out.println("Enter salary: ");
//            int salary = sc.nextInt();
//            preparedStatement.setInt(3,salary);
//            sc.nextLine();
//
//            System.out.println("Enter department: ");
//            String dept = sc.nextLine();
//            preparedStatement.setString(4,dept);
//
//            int result=preparedStatement.executeUpdate();
//            if(result != 0){
//                System.out.println("Record added successfully....");
//            }else {
//                System.out.println("Data is not added");
//            }

//            String allData = "select * from employee";
//            PreparedStatement preparedStatement =con.prepareStatement(allData);
//
//            ResultSet rs=preparedStatement.executeQuery();
//            while (rs.next()){
//                System.out.println("id: "+rs.getInt(1));
//                System.out.println("name: "+rs.getString(2));
//                System.out.println("salary: "+rs.getInt(3));
//                System.out.println("department: "+rs.getString(4));
//
//                System.out.println("------------------------------------------");
//            }

//            String getByIdQuery  = "select * from employee where eid = ?";
//            PreparedStatement preparedStatement1=con.prepareStatement(getByIdQuery);
//
//            System.out.println("Enter id: ");
//            int eid = sc.nextInt();
//            preparedStatement1.setInt(1,eid);
//
//            ResultSet rs=preparedStatement1.executeQuery();
//            while (rs.next()){
//                System.out.println("id: "+rs.getInt(1));
//                System.out.println("name: "+rs.getString(2));
//                System.out.println("salary: "+rs.getInt(3));
//                System.out.println("department: "+rs.getString(4));
//
//                System.out.println("------------------------------------------");
//            }



            con.close();
            sc.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
