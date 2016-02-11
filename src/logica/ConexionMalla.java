package logica;

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
	static LinkedList<String> dias = new LinkedList<String>();
	static LinkedList<String> horas = new LinkedList<String>();
	static LinkedList<String> labs = new LinkedList<String>();
	char ch = 34;
	
	public void conectar(int id)
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
				System.out.println("Dia:"+rs.getString("dia") +" Horario:"+rs.getString("horario")+" Lab:"+rs.getString("idLab_id"));
			}
			stmt.close();
			con.close();
		}
		
		catch ( Exception e ){
			System.out.println(e.getMessage());
		}
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
	


}
