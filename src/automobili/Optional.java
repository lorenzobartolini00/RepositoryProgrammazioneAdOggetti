package automobili;

public class Optional {
	
	//attributi
	private String codice;
	private String descrizione;
	private float valore;
	

	//costruttore
	public Optional(String codice, String descrizione, float valore) {
		this.codice=codice;
		this.descrizione=descrizione;
		this.valore=valore;
	}
	
	//getter e setter
	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getValore() {
		return valore;
	}

	public void setValore(float valore) {
		this.valore = valore;
	}
	
	//metodo
	public String toString() {
		return "Codice: " + codice + " | "
				+ "Descrizione: " + descrizione + " | "
				+ "Prezzo: " + valore + "$" + " | ";
	}

}
