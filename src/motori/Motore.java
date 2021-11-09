package motori;

public class Motore {
	//Default 
	private final int cilindri_default = 4;
	private final float cilindrata_default = 1200;
	private final float potenza_default = 85;
	private final boolean isDiesel_default = false;
	private final int RPM_default = 7000;
	
	
	public Motore(int cilindri, float cilindrata, int rPM) {
		this.cilindri = cilindri;
		this.cilindrata = cilindrata;
		this.RPM = rPM;
	}
	//Attributi
	protected int cilindri;
	protected float cilindrata;
	protected float potenza;
	protected boolean isDiesel;
	protected int RPM;
	
	//Getter e setter
	public int getCilindri() {
		return cilindri_default;
	}
	public void setCilindri(int cilindri) {
		this.cilindri = cilindri;
	}
	public float getCilindrata() {
		return cilindrata_default;
	}
	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public float getPotenza() {
		return potenza_default;
	}
	public void setPotenza(float potenza) {
		this.potenza = potenza;
	}
	public boolean isDiesel() {
		return isDiesel_default;
	}
	public void setDiesel(boolean isDiesel) {
		this.isDiesel = isDiesel;
	}
	public int getRPM() {
		return RPM_default;
	}
	public void setRPM(int rPM) {
		RPM = rPM;
	}
	
}
