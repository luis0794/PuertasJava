package logica;
import java.sql.*;

public class Conexion {
	
	static String driver = "org.postgresql.Driver";
	static String connectString = "jdbc:postgresql://localhost:5432/sistemacarlo";
	static String user = "postgres";
	static String password = "root";
	static Encriptacion cripto = new Encriptacion();
	static EstadoLabs estado = new EstadoLabs();
	static String id="";
	static String idMalla="";
	static String idRol="";
	static String userBase="";
	static String nameBase="";
	static String lastNBase="";
	static String contraBase="";
	
	public boolean login(String usuario,String contrasena)
	{
		String sql = "select * from usuario where username= '"+usuario+"'";
		boolean flag = false;
		try{
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectString, user , password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()){
				id = rs.getString("idusuario");
				userBase = rs.getString("username");
				nameBase = rs.getString("nombre");
				lastNBase = rs.getString("apellido");
				contraBase = rs.getString("password");
				idMalla= rs.getString("idusuariovinculado");
				idRol= rs.getString("idrol");
				if(contrasena.equals(cripto.Desencriptar(contraBase)) && usuario.equals(userBase)){flag=true;}
			}
			stmt.close();
			con.close();
		}
		
		catch ( Exception e ){
			System.out.println(e.getMessage());
		}
		if(idMalla==null){idMalla="-1";}
		return flag;
	}
	
	public void logout()
	{
		setIdMalla("");
		setIdRol("");
		setlastName("");
		setName("");
		setPasswd("");
		setUser("");
	}
	
	public boolean updatePass(String pass)
	{
		String critoPass = cripto.Encriptar(pass);
		String sql = "update usuario set password = '"+critoPass+"' where username = '"+userBase+"'";
		boolean flag = false;
		try{
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectString, user , password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		}
		
		catch ( Exception e ){
			System.out.println(e.getMessage());
		}
		return flag;
	}
	
	public boolean saveReg(int idLab, String fechaL, String hora, String semestre, String fechaC)
	{
		String sql = "insert into registro (idusuario,idlaboratorio,fecha_hora_registro,hora_registro,semestre_registro,fecha_registro) values ('"+id+"',"+idLab+",'"+fechaL+"','"+hora+"','"+semestre+"','"+fechaC+"')";
		boolean flag = false;
		try{
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectString, user , password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
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
	
	//
	public String getUser()
	{
		return userBase;
	}
	public void setUser(String usu)
	{
		userBase = usu;
	}
	
	//
	public String getPasswd()
	{
		return contraBase;
	}
	public void setPasswd(String pass)
	{
		contraBase = pass;
	}
	
	//
	public String getName()
	{
		return nameBase;
	}
	public void setName(String name)
	{
		nameBase = name;
	}
	
	//
	public String getlastName()
	{
		return lastNBase;
	}
	public void setlastName(String lastN)
	{
		lastNBase = lastN;
	}

}

