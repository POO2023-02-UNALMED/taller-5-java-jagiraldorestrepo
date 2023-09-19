package gestión;

import java.util.ArrayList;


import zooAnimales.Animal;



public class Zona {
	
	private String nombre;
	private ArrayList <Zoologico> zoo;
	private ArrayList<Animal> animales;
	
	//-------------constructores-------------
	public Zona() {
		this(null,null);
	}
	
	public Zona(String nombre,Zoologico z) {
		this.nombre = nombre;
		zoo=new ArrayList <>();
		if (z!=null) {
			zoo.add(z);
		}
		animales=new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo.get(0);
	}

	public void setZoo(Zoologico z) {
		zoo.add(z);
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public int cantidadAnimales() {
		return animales.size();
	
	}
	
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}

}
