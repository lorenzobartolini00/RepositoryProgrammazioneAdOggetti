package automobili;

import java.util.ArrayList;

import motori.Motore;

public class Fuoristrada extends Automobile{
	
	private float altezzaSospensioni;
	
	public Fuoristrada(String targa, String marca, String modello, Motore motore, ArrayList<Optional> listaOptional, float altezzaSospensioni) {
		super(targa,marca,modello,motore,listaOptional);
		this.altezzaSospensioni=altezzaSospensioni;
	}

	public float getAltezzaSospensioni() {
		return altezzaSospensioni;
	}

	public void setAltezzaSospensioni(float altezzaSospensioni) {
		this.altezzaSospensioni = altezzaSospensioni;
	}
	
}
