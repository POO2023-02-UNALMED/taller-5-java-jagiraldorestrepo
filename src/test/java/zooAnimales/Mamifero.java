package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado=new ArrayList <>();;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this(null,0,null,null,false,0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
	}
}

