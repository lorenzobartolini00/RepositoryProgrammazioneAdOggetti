package motori;



public class MotoreDiesel extends Motore{
	private static final int RPM_diesel_default = 3000;
	
	public MotoreDiesel(int cilindri, int cilindrata)
	{
		super(cilindri, cilindrata);
		this.potenza = this.cilindrata/this.cilindri/10;
		this.isDiesel = this instanceof MotoreDiesel;
		this.RPM = RPM_diesel_default;
	}
	
	//Getter e setter
		public int getCilindri() {
			return this.cilindri;  
		}
		public void setCilindri(int cilindri) {
			this.cilindri = cilindri;
		}
		public int getCilindrata() {
			return this.cilindrata;
		}
		public void setCilindrata(int cilindrata) {
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
			return this.RPM;
		}
		public void setRPM(int RPM) {
			this.RPM = RPM;
		}
	
}
