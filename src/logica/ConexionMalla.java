package logica;

import java.nio.channels.ShutdownChannelGroupException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class ConexionMalla {
	static String driver = "org.postgresql.Driver";
	static String connectString = "jdbc:postgresql://localhost:5432/dbcontrol";
	static String user = "postgres";
	static String password = "root";
	static int idLectivo=-1;
	static LinkedList<String> dias = new LinkedList<String>();;
	static LinkedList<String> horas = new LinkedList<String>();
	static LinkedList<String> labs = new LinkedList<String>();
	static LinkedList<String> promo = new LinkedList<String>();
	char ch = 34;
	
	public void conectar(int id)
	{
		if(id==-1)
		{
			EstadoLabs est = new EstadoLabs();
			est.estado();
		}else
		{
			String sql = "select * from control_lectivo where estado = 'TRUE'";
			
			try{
				Class.forName(driver);
				Connection con = DriverManager.getConnection(connectString, user , password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()){
					idLectivo = Integer.parseInt(rs.getString("id"));				
				}
				sql = "select * from control_distributivo where ("+ch+"idDocente_id"+ch+" = "+id+") and ("+ch+"idLectivo_id"+ch+"="+idLectivo+") ";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()){
					dias.add(rs.getString("dia"));
					horas.add(rs.getString("horario"));
					labs.add(rs.getString("idLab_id"));
					promo.add(rs.getString("idPromo_id"));
				}
				stmt.close();
				con.close();
			}
			
			catch ( Exception e ){
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void desconectar()
	{
		setDias();
		setHoras();
		setLabs();
	}
	
	public String getSemester(int idPromo)
	{
		String sql = "select * from control_semestre where id = "+(idPromo-1)+"";
		String nombre="";
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connectString, user , password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()){
				nombre=rs.getString("nombre");
			}
			
			stmt.close();
			con.close();
		}
		
		catch ( Exception e ){
			System.out.println(e.getMessage());
		}
		return nombre;
	}
	
	public LinkedList<String> getDias()
	{
		return dias;
	}
	public void setDias()
	{
		dias = new LinkedList<String>();
	}
	
	public LinkedList<String> getHoras()
	{
		return horas;
	}
	public void setHoras()
	{
		horas = new LinkedList<String>();
	}
	
	public LinkedList<String> getLabs()
	{
		return labs;
	}
	public void setLabs()
	{
		labs = new LinkedList<String>();
	}
	
	public String getLab(int p)
	{
		return labs.get(p);
	}
	
	public LinkedList<String> getPromo()
	{
		return promo;
	}
	public void setPromo()
	{
		promo = new LinkedList<String>();
	}
	
	


}
