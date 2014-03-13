package edu.upc.eetac.dsa.ejerciciosobjetos;


public class Arbol 
{
    String nombre;
    int altura;
    
	public Arbol(){
		nombre = "genérico";
		System.out.println( "Un arbol genérico" );
	}
	public Arbol(String name){
		nombre = name;
		System.out.println( "Un " + nombre);
	}
	public Arbol(int heigh){
		altura = heigh;
		System.out.println( "Un arbol de " + altura + " metros" );
	}
	
	public Arbol(int heigh, String name){
		nombre = name;
		altura = heigh;
		System.out.println( "Un " + name + " de " + altura + " metros" );

	}
	
}
