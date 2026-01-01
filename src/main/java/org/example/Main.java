package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final String JDBCURL ="jdbc:mysql://db:3306/biu";
    public static final String USER="root";
    public static final String PASS="root@123";
    public static void main(String[] args) throws Exception {
Scanner sc= new Scanner(System.in);
Connection con= DriverManager.getConnection(JDBCURL,USER,PASS);

while(true){
    System.out.println("\n1.Create 2.Delete 3.Update 4.Select 5.Exit");
    int choice=sc.nextInt();
    switch(choice) {
        case 4:
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from product");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            break;
        case 5:
            con.close();
            System.exit(0);

    }
}
        }
    }



//        import java.sql.*;
//        import java.util.Scanner;
//
//public class JdbcMenu {
//
//    static final String URL =
//            "jdbc:mysql://db:3306/testdb";
//    static final String USER = "root";
//    static final String PASS = "root";
//
//    public static void main(String[] args) throws Exception {
//
//        Scanner sc = new Scanner(System.in);
//        Connection con = DriverManager.getConnection(URL, USER, PASS);
//
//        while (true) {
//            System.out.println("\n1.Create 2.Delete 3.Update 4.Select 5.Exit");
//            int ch = sc.nextInt();
//
//            switch (ch) {
//
//                case 1: // CREATE
//                    System.out.print("ID Name Age: ");
//                    PreparedStatement ps1 =
//                            con.prepareStatement(
//                                    "INSERT INTO student VALUES (?,?,?)");
//                    ps1.setInt(1, sc.nextInt());
//                    ps1.setString(2, sc.next());
//                    ps1.setInt(3, sc.nextInt());
//                    ps1.executeUpdate();
//                    System.out.println("Inserted");
//                    break;
//
//                case 2: // DELETE
//                    System.out.print("ID: ");
//                    PreparedStatement ps2 =
//                            con.prepareStatement(
//                                    "DELETE FROM student WHERE id=?");
//                    ps2.setInt(1, sc.nextInt());
//                    ps2.executeUpdate();
//                    System.out.println("Deleted");
//                    break;
//
//                case 3: // UPDATE
//                    System.out.print("Name ID: ");
//                    PreparedStatement ps3 =
//                            con.prepareStatement(
//                                    "UPDATE student SET name=? WHERE id=?");
//                    ps3.setString(1, sc.next());
//                    ps3.setInt(2, sc.nextInt());
//                    ps3.executeUpdate();
//                    System.out.println("Updated");
//                    break;
//
//                case 4: // SELECT
//                    Statement st = con.createStatement();
//                    ResultSet rs =
//                            st.executeQuery("SELECT * FROM student");
//                    while (rs.next()) {
//                        System.out.println(
//                                rs.getInt(1) + " " +
//                                        rs.getString(2) + " " +
//                                        rs.getInt(3));
//                    }
//                    break;
//
//                case 5:
//                    con.close();
//                    System.exit(0);
//            }
//        }
//    }
//}
