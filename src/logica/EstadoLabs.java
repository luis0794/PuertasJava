package logica;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;

public class EstadoLabs {
	static ConexionMalla conMalla = new ConexionMalla();
	static Conexion con = new Conexion();
	static boolean[] estados = new boolean[12];
	static String[] datos = new String[3];
	static LinkedList<String> dias = conMalla.getDias();
	static LinkedList<String> horas = conMalla.getHoras();
	static LinkedList<String> labs = conMalla.getLabs();
	static LinkedList<String> promo = conMalla.getPromo();
	static String fechaL = "";
	static String fechaC = "";
	static String hora = "";
	static Locale l = new Locale("es","EC");
	static Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Bogota"),l);
	
	public boolean[] estado()
	{
		llenarF();
		if(con.getIdRol().equals("1"))//Administrador
		{
			llenarT();
		}
		
		if(con.getIdRol().equals("2"))//Docente
		{
			Date();
			switch ( datos[0] ) {
		      case "Lunes":
		    	  verificar("Lunes");
		    	  break;
		      case "Martes":
		    	  verificar("Martes");
		    	  break;
		      case "Miercoles":
		    	  verificar("Miercoles");
		    	  break;
		      case "Jueves":
		    	  verificar("Jueves");
		    	  break;
		      case "Viernes":
		    	  verificar("Viernes");
		    	  break;
			}
		}
		return estados;
	}
	
	static void llenarF()
	{
		for (int i = 0; i < estados.length; i++) {
			estados[i]=false;
		}	
	}
	
	static void llenarT()
	{
		for (int i = 0; i < estados.length; i++) {
			estados[i]=true;
		}	
	}
	
	static String[] Date()
	{
		String[] dias = new String[5];
		dias[0]="Lunes";
		dias[1]="Martes";
		dias[2]="Miercoles";
		dias[3]="Jueves";
		dias[4]="Viernes";
		datos[0]=dias[cal.get(Calendar.DAY_OF_WEEK)-2];
		datos[1]=""+cal.get(Calendar.HOUR);
		datos[2]=""+cal.get(Calendar.MINUTE);
		return datos;
		
	}
	public String fechaL()
	{	
		String[] meses = new String[12];
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
		String fecha = cal.get(Calendar.DAY_OF_MONTH)+" de "+meses[cal.get(Calendar.MONTH)]+
				" del "+cal.get(Calendar.YEAR)+" a las "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE);
		return fecha;
	}
	
	public String fechaC()
	{
		String fecha=""+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH);
		return fecha;
	}
	
	public String hora()
	{
		String hora=""+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE);
		return hora;
	}
	
	static void verificar(String dia)
	{
		for (int i = 0; i < dias.size(); i++) {
			if (dias.get(i).equals(dia)) 
			{
				promo.set(i, ""+i);
				System.out.println(i+"");
				String[] hora = horas.get(i).split("-");
				String horamI = hora[0];
				String horamF = hora[1];
				String[] horaMI = horamI.split(":");
				int hora1 = Integer.parseInt(horaMI[0]);
				int min1 = Integer.parseInt(horaMI[1]);
				String[] horaMF = horamF.split(":");
				int hora2 = Integer.parseInt(horaMF[0]);
				int min2 = Integer.parseInt(horaMF[1]);
				
				if(Integer.parseInt(datos[1])>=hora1 && Integer.parseInt(datos[2])>=min1)  
				{
					if(Integer.parseInt(datos[1])< hora2 && Integer.parseInt(datos[2])<=59)
					{
						estados[Integer.parseInt(labs.get(i))-1]=true;
					}
				}
			}
		}
	}
}
