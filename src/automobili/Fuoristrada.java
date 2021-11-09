package automobili;

import motori.Motore;

public class Fuoristrada extends Automobile{
	
	private float passo;	//in millimetri
	
	public Fuoristrada(String targa, String marca, String modello, Motore motore, float passo) {
		super(targa,marca,modello,motore);
		this.passo=passo;
	}

	public float getPasso() {
		return passo;
	}

	public void setPasso(float passo) {
		this.passo = passo;
	}
	
}
