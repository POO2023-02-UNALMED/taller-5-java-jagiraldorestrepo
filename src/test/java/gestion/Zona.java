package gestion;

import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
	private String nombre;
	//private ArrayList <Zoologico> zoo;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animales;
	
	public Zona() {
		this(null,null);
	}
	
	/*public Zona(String nombre,Zoologico z) {
		this.nombre = nombre;
		zoo=new ArrayList <>();
		if (z!=null) {
			zoo.add(z);
		}
		animales=new ArrayList<>();
	}*/
	
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo[0] = zoo;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public Zoologico getZoo() {
		return zoo.get(0);
	}

	public void setZoo(Zoologico z) {
		zoo.add(z);
	}*/
	
	public Zoologico getZoo() {
	    return zoo[0];
	}

	public void setZoo(Zoologico[] zoo) {
	    this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
    public Zoologico getZoologico(){
        return zoo[0];
    }
}
