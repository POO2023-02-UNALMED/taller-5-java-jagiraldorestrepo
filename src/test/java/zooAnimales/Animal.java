package zooAnimales;

import java.util.ArrayList;

import gestion.*;


public class Animal {
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	//private ArrayList<Zona> zona;
	protected Zona[] zona = new Zona[1];  //cambio
	
	
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

	/*public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}*/
	
    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
    }
	
	
	
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+"\n"+"Aves: " + Ave.cantidadAves()+"\n"+"Reptiles: " + Reptil.cantidadReptiles()+"\n"+"Peces: " + Pez.cantidadPeces()+"\n"+"Anfibios: "+ Anfibio.cantidadAnfibios();
	}
	

    public String toString(){
        String zonZoo = "";
        if(zona[0] != null && zona[0].getZoologico() != null){
            zonZoo = ", la zona en la que me ubico es "+this.zona[0]+", en el "+ this.zona[0].getZoologico();
        }
        return "Mi nombre es " + this.nombre + ", tengo una edad de "+this.edad+
        ", habito en " + this.habitat + " y mi genero es " + this.genero + zonZoo;
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
