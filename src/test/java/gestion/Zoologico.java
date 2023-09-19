package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	
	public Zoologico() {
		this(null,null);
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		zonas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public int cantidadTotalAnimales() {
		int x=0;
		for (int i=0;i<zonas.size();i++) {
			x=x+zonas.get(i).cantidadAnimales();
			}
		return x;
		}
	
	public void agregarZonas(Zona newZona) {
		zonas.add(newZona);
		newZona.setZoo(this);
	}

}