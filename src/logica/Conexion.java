package logica;
import java.sql.*;




public class Conexion {
	
	static String driver = "org.postgresql.Driver";
	static String connectString = "jdbc:postgresql://localhost:5432/sistemacarlo";
	static String user = "postgres";
	static String password = "root";
	static Encriptacion cripto = new Encriptacion();
	static String idMalla="";
	static String idRol="";
	
	public boolean login(String usuario,String contrasena)
	{
		String sql = "select * from usuario where username= '"+usuario+"'";
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
				idMalla= rs.getString("idusuariovinculado");
				idRol= rs.getString("idrol");
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
	
	public String getIdMalla()
	{
		return idMalla;
	}
	public void setIdMalla(String id)
	{
		idMalla = id;
	}
	
	public String getIdRol()
	{
		return idRol;
	}
	public void setIdRol(String id)
	{
		idRol = id;
	}
	

}

