package ual.hmis.sesion05.ejercicio3;
import java.util.*;

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
		
		// comprobar que la longitud sea < 12 y > 8
		if (password.length()>8&&password.length()<12) {
			String s = "";
			for(int i=0; i<password.length();i++) {
				 s += "*";
			}
			return s;
		}
		// comprobar que la longitud sea > 12
		if (password.length()>=12&&password.length()<=40)
			return "************";
		
		// comprobar que la longitud sea > 40
		return "password demasiado largo";
	}
}
