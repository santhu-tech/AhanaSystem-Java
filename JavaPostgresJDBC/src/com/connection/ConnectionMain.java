package com.connection;

import java.sql.*;

public class ConnectionMain {
    public static void main(String[] args) throws Exception {
       String sql="select fname from employees where emp_id=1";
        String url="jdbc:postgresql://localhost:5432/test";
        // "jdbc:postgresql://localhost:5432/postgres"
       String userName="postgres";
       String passWord="Viyaan@11";

        Connection con= DriverManager.getConnection(url,userName,passWord);   //Establishing the connection


        Statement stmt=con.createStatement();       //-->giving the input directly here
      //  PreparedStatement  -->user input

       // stmt.executeQuery(sql);

        ResultSet rs=stmt.executeQuery(sql);
        rs.next();

        String name=rs.getString(1);
        System.out.println(name);
        con.close(); ///Closing the connection

        //AutoCloseable
    }



}
