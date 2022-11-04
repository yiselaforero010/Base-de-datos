/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacesita;

import java.sql.*;

public class Bacesita {

    public static void main(String[] args) throws SQLException {
        // Establecemos la conexión con la base de datos.
        Connection conexion = DriverManager.getConnection
        ("jdbc:mysql://localhost/prueba","root", "");
        
        // Preparamos la consulta
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery ("select * from persona");

        /*Recorremos el resultado, mientras haya registros para leer, y
        escribimos el resultado en pantalla.*/
        while (rs.next())
        {
            System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " +
            rs.getDate(3));
        }
        
        // Cerramos la conexion a la base de datos.
        conexion.close();
    }
    
}
