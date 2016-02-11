package logica;
import java.sql.*;

import javax.script.*;
import php.java.bridge.*;
import php.java.script.*;
import php.java.servlet.*;


public class Conexion {
	
	static String driver = "org.postgresql.Driver";
	static String connectString = "jdbc:postgresql://localhost:5432/sistemacarlo";
	static String user = "postgres";
	static String password = "root";
	static Encriptacion cripto = new Encriptacion();
	
	public boolean login(String usuario,String contrasena)
	{
		String sql = "select * from usuario";
		String userBase="";
		String contraBase="";
		boolean flag = false;
		
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectString, user , password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()){
				userBase = rs.getString("username");
				contraBase = rs.getString("password");
				if(contrasena.equals(contraBase) && usuario.equals(userBase)){flag=true;}
			}
			stmt.close();
			con.close();
		}
		
		catch ( Exception e ){
			System.out.println(e.getMessage());
		}
		return flag;
	}
	
	public void prueba()
	{
		String code="echo 5+5;"; 
		System.out.println("si");
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByExtension("php");
		try {
		    engine.eval(code);
		} catch (ScriptException ex) {
		    //catch statement
		}
	}
	

}

