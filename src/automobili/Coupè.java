package automobili;

import java.util.ArrayList;

import motori.Motore;

public class Coup� extends Automobile {
	
	//attributi
	private float tempoAperturaTettuccio;
	private String materialeTettuccio;
	
	
	//costruttore
	public Coup�(String targa, String marca, String modello, Motore motore, ArrayList<Optional> listaOptional, float tempoAperturaTettuccio, String materialeTettuccio) {
		super(targa,marca,modello,motore,listaOptional);
		this.tempoAperturaTettuccio=tempoAperturaTettuccio;
		this.materialeTettuccio=materialeTettuccio;
	}

	//getter e setter

	public float getTempoAperturaTettuccio() {
		return tempoAperturaTettuccio;
	}


	public void setTempoAperturaTettuccio(float tempoAperturaTettuccio) {
		this.tempoAperturaTettuccio = tempoAperturaTettuccio;
	}


	public String getMaterialeTettuccio() {
		return materialeTettuccio;
	}


	public void setMaterialeTettuccio(String materialeTettuccio) {
		this.materialeTettuccio = materialeTettuccio;
	}
	
	
}
