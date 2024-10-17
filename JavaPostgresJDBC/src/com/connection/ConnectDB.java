package com.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDB {
    //  public static void main(String[] args) {
    public Connection connect_to_db(String dbname, String user, String password) {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");  //Load the drivers
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Viyaan@11"); //Establish the connection
            //Perform the CRUD Operations
           // createRecord(connection);
            //readRecord(connection);
            //updateRecord(connection);
            //deleteRecord(connection);

            if (connection != null)
                System.out.println("Connection established");
            else
                System.out.println("Connection failed");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}

//    public void createTable(Connection conn,String table_name){
//        Statement statement;
//        try{
//            String query="create table "+table_name+ "(stu_id SERIAL,name varchar(200),marks int,primary key(stu_id));";
//            statement=conn.createStatement();
//            statement.executeQuery(query);
//            System.out.println("Table created");
//        }
//        catch(Exception e){
//            System.out.println(e);
//
//        }

//    }

