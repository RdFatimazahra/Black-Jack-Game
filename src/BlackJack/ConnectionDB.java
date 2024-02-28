package BlackJack;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDB {
	

	public static void main(String[] args) {

		Connection connection = null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:2909/postgres","postgres","admin");
			if(connection!= null) {
				System.out.println("Connection OK");
			} else {
				System.out.println("Connection Failed");
				
			}
			} catch (Exception e) {
				
				System.out.println(e);
				
			}
				
		}
		
	}
