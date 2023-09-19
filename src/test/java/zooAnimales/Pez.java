package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList <>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez() {
		this(null,0,null,null,null,0);
	}
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	
	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	
	public static Animal crearSalmon(String name, int age, String gender) {
		salmones++;
		return new Pez(name,age,"oceano", gender,"rojo",6);
	}
	public static Animal crearBacalao(String name, int age, String gender) {
		bacalaos++;
		return new Pez(name,age,"oceano", gender,"gris",6);
	}

}
