package edu.upc.eetac.dsa.ejerciciosobjetos;

public class PruebaFormas {
	public static void main(String[] args) { 
		Forma[] s = new Forma[3]; 
		s[0] = new Forma(); 
		// Circulo es tambien una Forma 
		s[1] = new circulo(); 
		// Cuadrado es tambien una Forma 
		s[2] = new cuadrado(); 
		 
		for(int i = 0; i < s.length; i++) 
		s[i].quees(); 
		}
}
