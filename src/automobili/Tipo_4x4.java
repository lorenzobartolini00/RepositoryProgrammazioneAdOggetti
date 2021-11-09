package automobili;

import java.util.ArrayList;

import motori.Motore;

public class Tipo_4x4 extends Automobile{
	
	private float altezzaSospensioni;
	
	public Tipo_4x4(float altezzaSospensioni,String targa, String marca, String modello, Motore motore, ArrayList<Optional> listaOptional) {
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
