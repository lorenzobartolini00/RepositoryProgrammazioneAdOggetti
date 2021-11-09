package automobili;

import java.util.*;
import motori.Motore;

//creo la superclasse automobile

public class Automobile {

	Scanner in=new Scanner(System.in);

	//attributi
	
	private String targa;
	private String marca;
	private String modello;
	private Motore motore;
	private ArrayList<Optional> listaOptional=new ArrayList<Optional>();
	
	//costruttore
	
	public Automobile(String targa, String marca, String modello, Motore motore) {
		this.targa=targa;
		this.marca=marca;
		this.modello=modello;
		this.motore=motore;
	}
		
	//getter e setter
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Motore getMotore() {
		return motore;
	}
	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	
	//metodi
	
	//addOption deve prendere in ingresso un'istanza della classe Optional
	public void addOptional(Optional ... optional) {
		for( Optional o : optional)
			 {
				listaOptional.add(o);
			 }
	}
	
	public String toString() {
		return this.targa + " | "+ this.marca + " | "+ this.modello + " || "+ this.motore.toString();
	}
}
