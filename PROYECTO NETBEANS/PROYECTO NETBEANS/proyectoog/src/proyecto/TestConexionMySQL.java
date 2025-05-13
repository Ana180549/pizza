import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexionMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Pizzeria";
        String usuario = "root"; // Cambia por tu usuario
        String contraseña = "Admin010304$"; // Cambia por tu contraseña

        try {
            // Intenta cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✔ Driver MySQL encontrado!");

            // Intenta conectar
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✔ Conexión exitosa a MySQL!");
            conexion.close();
        } catch (ClassNotFoundException e) {
            System.err.println("✖ Error: No se encontró el driver MySQL");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("✖ Error al conectar a MySQL");
            e.printStackTrace();
        }
    }
}