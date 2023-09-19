package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado=new ArrayList <>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		this(null,0,null,null,null,0);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	
	public ArrayList<Reptil> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	public static Animal crearSerpiente(String name , int age, String gender) {
		serpientes++;
		return new Reptil(name,age,"jungla",gender,"blanco",1);
	}
	public static Animal crearIguana(String name, int age, String gender) {
		iguanas++;
		return new Reptil(name,age,"humedal",gender,"verde",3);
	}

}
