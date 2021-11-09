package automobili;

import java.util.Scanner;

//creo la superclasse automobile

public class Automobile {

	Scanner in=new Scanner(System.in);

	//attributi
	
	private String targa;
	private String marca;
	private String modello;
	private Motore motore = new Motore();
	private ArrayList<Optional> listaOptional=new ArrayList<Optional>();
		
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
	public void addOptional() {
		String codice = in.nextLine();
		String descrizione = in.nextLine();
		float valore = in.nextFloat();
		Optional optional=new Optional(codice,descrizione,valore);
		listaOptional.add(optional);
	}
}
