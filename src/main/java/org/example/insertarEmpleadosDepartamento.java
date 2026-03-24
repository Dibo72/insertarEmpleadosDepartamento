package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertarEmpleadosDepartamento {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword());
            Statement stmt =conn.createStatement()) {

            String sql = "INSERT INTO departamento VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "D1");
            pstmt.setString(2, "Ventas");

            pstmt.executeUpdate();

            String sql2 = "INSERT INTO departamento VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql2);
            pstmt.setString(1, "D2");
            pstmt.setString(2, "Programacion");

            pstmt.executeUpdate();

            String sql3 = "INSERT INTO departamento VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql3);
            pstmt.setString(1, "D3");
            pstmt.setString(2, "Jefe");

            pstmt.executeUpdate();


            System.out.println("Tablas insertadas");

            String empleado1 = "INSERT INTO empleado VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(empleado1);
            pstmt.setString(1, "E1");
            pstmt.setString(2, "Emilio");
            pstmt.setString(3, "2000");
            pstmt.setString(4, "D1");

            pstmt.executeUpdate();

            String empleado2 = "INSERT INTO empleado VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(empleado2);
            pstmt.setString(1, "E2");
            pstmt.setString(2, "Juanma");
            pstmt.setString(3, "1500");
            pstmt.setString(4, "D2");

            pstmt.executeUpdate();

            String empleado3 = "INSERT INTO empleado VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(empleado3);
            pstmt.setString(1, "E3");
            pstmt.setString(2, "Maria");
            pstmt.setString(3, "5000");
            pstmt.setString(4, "D3");

            pstmt.executeUpdate();

            String empleado4 = "INSERT INTO empleado VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(empleado4);
            pstmt.setString(1, "E4");
            pstmt.setString(2, "Pepe");
            pstmt.setString(3, "3600");
            pstmt.setString(4, "D2");

            pstmt.executeUpdate();

            String empleado5 = "INSERT INTO empleado VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(empleado5);
            pstmt.setString(1, "E5");
            pstmt.setString(2, "Josefa");
            pstmt.setString(3, "1000");
            pstmt.setString(4, "D1");

            pstmt.executeUpdate();

            System.out.println("Empleados insertados");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}