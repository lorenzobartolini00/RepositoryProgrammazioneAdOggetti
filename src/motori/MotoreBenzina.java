package motori;



public class MotoreBenzina extends Motore{
	private static final int RPM_benzina_default = 9000;
	
	public MotoreBenzina(int cilindri, int cilindrata)
	{
		super(cilindri, cilindrata);
		this.potenza = this.cilindrata/this.cilindri/20;
		this.isDiesel = !(this instanceof MotoreBenzina);
		this.RPM = RPM_benzina_default;
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
			return this.potenza;
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
