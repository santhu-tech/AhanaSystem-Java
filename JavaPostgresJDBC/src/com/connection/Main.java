package com.connection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectDB db=new ConnectDB();
        db.connect_to_db("employees","postgres","Viyaan@11");
       // Connection conn=db.connect_to_db("employees","postgres","Viyaan@11");
       // db.createTable(conn,"student");
    }
}

