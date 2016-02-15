package logica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class Llamar {
	public void holaPython() throws IOException
	{
		String pythonScriptPath = "C:/Users/luist/Desktop/hola.py";
		String[] cmd = new String[2];
		cmd[0] = "python"; // check version of installed python: python -V
		cmd[1] = pythonScriptPath;
		 
		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		 
		// retrieve output from python script
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while((line = bfr.readLine()) != null) {
		// display each output line form python script
		System.out.println(line);
		}
	
	}
	
	public boolean pulsoPHP(String ruta) throws IOException
	{
		URL url = new URL(ruta);
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
		return true;
	}
}
