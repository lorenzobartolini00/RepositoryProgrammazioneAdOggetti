package automobili;

import motori.Motore;

public class Coupè extends Automobile {
	
	//attributi
	private float tempoAperturaTettuccio;
	private String materialeTettuccio;
	
	
	//costruttore
	public Coupè(String targa, String marca, String modello, Motore motore, float tempoAperturaTettuccio, String materialeTettuccio) {
		super(targa,marca,modello,motore);
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
