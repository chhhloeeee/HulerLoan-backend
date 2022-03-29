package com.example.loan;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;

public class LoanApplication {
    public static void main(String[] args) {
         try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Loaded driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?user=root&password=chloeMouse1!");
                System.out.println("Connected to MySQL");
                con.close();
         } 
         catch (Exception ex) {
                ex.printStackTrace(); 
         }
    }
}