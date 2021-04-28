package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionFactory {

	private String tipoDeBanco;

	public Connection getConnection() {
		try {
			Connection c = DriverManager.getConnection("jdbc:" + tipoDeBanco() + "://localhost/meuDB", "root", "123");
			return c;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public String tipoDeBanco() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o banco de dados? ex: mysql, postgres, redis ");
		tipoDeBanco = teclado.nextLine();
		return tipoDeBanco;
	}
}
