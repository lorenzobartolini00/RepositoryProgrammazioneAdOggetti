package motori;



public class MotoreBenzina extends Motore{
	private static final int RPM_benzina_default = 9000;
	
	MotoreBenzina(int cilindri, float cilindrata, int rPM)
	{
		super(cilindri, cilindrata, RPM_benzina_default);
	}
	
	//Getter e setter
		public int getCilindri() {
			return this.cilindri;
		}
		public void setCilindri(int cilindri) {
			this.cilindri = cilindri;
		}
		public float getCilindrata() {
			return this.cilindrata;
		}
		public void setCilindrata(float cilindrata) {
			this.cilindrata = cilindrata;
		}
		public float getPotenza() {
			return cilindrata/cilindri/20;
		}
		public void setPotenza(float potenza) {
			this.potenza = potenza;
		}
		public boolean isDiesel() {
			return isDiesel = !(this instanceof MotoreBenzina);
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
