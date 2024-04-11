package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String paswor (String password){
		// comprobar que sean distintos de vacio
		if (password.isEmpty())
			return " ";
		// comprobar que la longitud sea < 5
		if (password.length()<5)
			return "password demasiado corto";
		
		// comprobar que la longitud sea < 8 y > 5
		if (password.length()>=5&&password.length()<=8)
			return "********";
		
		// comprobar que la longitud sea > 12
		if (password.length()>=12&&password.length()<=40)
			return "************";
		
		// comprobar que la longitud sea > 40
		if (password.length()>40)
		return "password demasiado largo";
		
		return "Error";
	}
}
