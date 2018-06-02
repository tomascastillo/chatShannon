package handlers;

import java.io.IOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import fecha.Fecha;

public class DiferenciaFechasHandler extends AsistantSentenceHandler{
	private String msg;
	public DiferenciaFechasHandler () {
		patron = Pattern.compile(".*(qu� d�a ser� dentro de|qu� d�a fue|cu�ntos d�as pasaron desde el|cu�ntos d�as faltan para el).*");
	
	}
	
	
	
	@Override
	public String giveAnswer(String mensaje, String nombreUsuario) {
		msg=mensaje;
		Matcher matcher = patron.matcher(mensaje);		
	    if(matcher.find()) {
			String intro;
			/*if() (mensaje cumple con que esta pidiendo con averiguar cuantos dias faltan)
			return calcular(mensaje,nombreUsuario ,false);				
	
		else if()(mensaje cumple con que esta pidiendo con averiguar cuantos dias pasaron)
			return calcular(mensaje,nombreUsuario, true);
		
		else if(){(mensaje cumple con que esta pidiendo diferencia de fechas)
			Calendar fechaPreguntada = Fecha.cadenaAFecha(mensaje);				
			long diasDiferencia = Fecha.restarFechas(Fecha.getToday(), fechaPreguntada);
			return diasPasaron(diasDiferencia,Fecha.getToday(),fechaPreguntada, nombreUsuario);*/
			
			if(msg.contains("qu� d�a ser� dentro de"))//msg.contains("cu�ntos d�as faltan para el"))// (mensaje cumple con que esta pidiendo con averiguar cuantos dias faltan)
			return calcular(msg,nombreUsuario ,false);	
			else if(msg.contains("qu� d�a fue"))//msg.contains("cu�ntos d�as pasaron desde el"))//(mensaje cumple con que esta pidiendo con averiguar cuantos dias pasaron)
			return calcular(msg,nombreUsuario, true);
			
			else if(msg.contains("cu�ntos d�as pasaron desde el")){//(mensaje cumple con que esta pidiendo diferencia de fechas)
					try{
						Calendar fechaPreguntada = Fecha.cadenaAFecha(msg);				
						long diasDiferencia = Fecha.restarFechas(Fecha.getToday(), fechaPreguntada);
						return diasPasaron(diasDiferencia,Fecha.getToday(),fechaPreguntada, nombreUsuario);
					}
					 catch (java.text.ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return "";
					}
			}
			else if(msg.contains("cu�ntos d�as faltan para el")){
				try{
					Calendar fechaPreguntada = Fecha.cadenaAFecha(msg);				
					long diasDiferencia = (-1)* Fecha.restarFechas(Fecha.getToday(), fechaPreguntada)+1;
					return diasFaltan(diasDiferencia, nombreUsuario);
				}
				 catch (java.text.ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "";
				}
			}
			return "";
	    }
		else
			return this.nextHandler.giveAnswer(mensaje, nombreUsuario);
	}
	
	
	private String calcular(String mensaje, String nombreUsuario, boolean averiguarDiasPasados){		
			
			StringTokenizer cadenaCompleta = new StringTokenizer(mensaje);
			String partes,periodo = "";
		    int diferencia=0;
		    Calendar resultado;	    
			
		    while (cadenaCompleta.hasMoreTokens()) {
		         partes=cadenaCompleta.nextToken();
		         if(partes.matches("^[1-9][0-9]*$")){
		        	 diferencia=Integer.parseInt(partes);
		         }
		     }
		     if(mensaje.contains("d�as")){
		    	 periodo="d�a";
		     }
		     
		     else if(mensaje.contains("ayer")){
		    	 periodo="d�a";
		    	 diferencia=1;
		     }
		     	     
		     else if(mensaje.contains("meses")){
		    	 periodo="mes";
		     }
		     else{
		    	 periodo="a�o";
		     }
		     
		     if(averiguarDiasPasados){
		    	 resultado= diaDentro(diferencia * (-1), periodo);
			     return fechaHace(resultado,nombreUsuario);	 
		     }
		     else{
		    	 resultado= diaDentro(diferencia, periodo);
			     return fechaDentro(resultado,nombreUsuario);	 
		     }				
		}
				
	private static Calendar diaDentro(int aSumar, String caso){
		Calendar fecha = Calendar.getInstance();
		
		if (caso=="mes"){
			fecha.add(Calendar.MONTH,aSumar);
		}
		else if(caso=="a�o"){
			fecha.add(Calendar.YEAR,aSumar);
		}
		else
			fecha.add(Calendar.DAY_OF_MONTH,aSumar);
		
		return fecha;
	}	
	
	private String diasPasaron(long dias,Calendar f1,Calendar f2, String nombreUsuario){
		return "@" + nombreUsuario + " entre el "+ Fecha.fechaACadenaSinDia(f2) 
				+ " y el " + Fecha.fechaACadenaSinDia(f1) + " pasaron " + (dias) + " d�as";
	}	
	
	private String diasFaltan(long dias, String nombreUsuario){
		return "@" + nombreUsuario +" faltan "+ dias +" d�as";
	}
	
	private String fechaHace(Calendar f1, String nombreUsuario){		
		return "@" + nombreUsuario + " fue el "+ Fecha.fechaACadena(f1);
	}
	
	private String fechaDentro(Calendar f1, String nombreUsuario){		
		return "@" + nombreUsuario + " ser� el "+ Fecha.fechaACadena(f1);
	}
}
