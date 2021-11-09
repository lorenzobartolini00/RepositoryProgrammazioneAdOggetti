package motori;

public class Motore {
	//Default 
	private final int cilindri_default = 4;
	private final float cilindrata_default = 1200;
	private final float potenza_default = 85;
	private final boolean isDiesel_default = false;
	private final int RPM_default = 7000;
	
	
	public Motore(int cilindri, float cilindrata, float potenza, boolean isDiesel, int rPM) {
		this.cilindri = cilindri;
		this.cilindrata = cilindrata;
		this.potenza = potenza;
		this.isDiesel = isDiesel;
		this.RPM = rPM;
	}
	//Attributi
	private int cilindri;
	private float cilindrata;
	private float potenza;
	private boolean isDiesel;
	private int RPM;
	
	//Getter e setter
	public int getCilindri() {
		return cilindri;
	}
	public void setCilindri(int cilindri) {
		this.cilindri = cilindri;
	}
	public float getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public float getPotenza() {
		return potenza;
	}
	public void setPotenza(float potenza) {
		this.potenza = potenza;
	}
	public boolean isDiesel() {
		return isDiesel;
	}
	public void setDiesel(boolean isDiesel) {
		this.isDiesel = isDiesel;
	}
	public int getRPM() {
		return RPM;
	}
	public void setRPM(int rPM) {
		RPM = rPM;
	}
	
}
