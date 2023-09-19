package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;


public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal() {
		this(null,0,null,null);
	}
	
	public Animal( String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+"\n"+"Aves: " + Ave.cantidadAves()+"\n"+"Reptiles: " + Reptil.cantidadReptiles()+"\n"+"Peces: " + Pez.cantidadPeces()+"\n"+"Anfibios: "+ Anfibio.cantidadAnfibios();
	}
	
public String toString() {
		
		if (this.zona.size() != 0) {
			
			return ("Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero + 
					" la zona en la que me ubico es " + this.zona.get(0) + 
					", en el " + this.zona.get(0).getZoo());
			
		}
		
		else {
			
			return ("Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero);
		}
	}
	
	public String movimiento() {
		if(this instanceof Mamifero) {
			return "desplazarse";
		}
		else if(this instanceof Ave) {
			return "volar";
		}
		else if(this instanceof Reptil) {
			return "reptar";
		}
		else if(this instanceof Pez) {
			return "nadar";
		}
		else {
			return "saltar";
		}
	}
	

}
