package PERSISTÊNCIA;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;



public class DB_SISTFOOD {

	
		
	public static Connection faz_conexao() throws SQLException{
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","0308");
	
	
		
	} catch(ClassNotFoundException e) {
		throw new SQLException(e.getException());
		}
	}
}

