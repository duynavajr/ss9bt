package com.mosoftvn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // thuộc tính driver
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    // thuôc tính url
    private final  static String URL = "jdbc:mysql://localhost:3306/quanlylophoc";
    // thuộc tính user
    private  final  static  String USER = "root";
    // thuộc tính password
    private final  static String PASSWORD ="123456";

    // phuong thuc mo ket noi
    public static Connection openConnection(){
        Connection connection = null;

        try {
            // dang ky driver
            Class.forName(DRIVER);
            // mo ket noi
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  connection;
    }

    // phuong thuc dong ket noi
    public  static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
