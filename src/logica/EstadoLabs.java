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
	
	public boolean[] estado()
	{
		llenarF();
		if(con.getIdRol().equals("1"))//Administrador
		{
			llenarT();
		}
		
		if(con.getIdRol().equals("2"))//Docente
		{
			System.out.println("docente");
			Date();
			switch ( datos[0] ) {
		      case "Lunes":
		    	  for (int i = 0; i < dias.size(); i++) {
						if (dias.get(i).equals("Lunes")) 
						{
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
		    	  break;
		      case "Martes":
		    	  for (int i = 0; i < dias.size(); i++) {
						if (dias.get(i).equals("Martes")) 
						{
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
		    	  break;
		      case "Miercoles":
		    	  for (int i = 0; i < dias.size(); i++) {
						if (dias.get(i).equals("Miercoles")) 
						{
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
		    	  break;
		      case "Jueves":
		    	  for (int i = 0; i < dias.size(); i++) {
						if (dias.get(i).equals("Jueves")) 
						{
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
		    	  break;
		      case "Viernes":
		    	  for (int i = 0; i < dias.size(); i++) {
						if (dias.get(i).equals("Viernes")) 
						{
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
	
	public String[] Date()
	{
		String[] dias = new String[5];
		dias[0]="Lunes";
		dias[1]="Martes";
		dias[2]="Miercoles";
		dias[3]="Jueves";
		dias[4]="Viernes";
		Locale l = new Locale("es","EC");
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Bogota"),l);
		datos[0]=dias[cal.get(Calendar.DAY_OF_WEEK)-2];
		datos[1]=""+cal.get(Calendar.HOUR);
		datos[2]=""+cal.get(Calendar.MINUTE);
		return datos;
		
	}
}
