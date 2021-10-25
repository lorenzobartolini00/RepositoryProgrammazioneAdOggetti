package GestioneBanca;

public class ContoCorrente {
	
	private String tipoConto;
	private double saldo;
	private int numeroConto;
	private double tassoFamily = 0.01;
	private double tassoBusiness = 0.05;
	private static int numeroUltimoConto = 1000;
	
	public ContoCorrente(String tipoConto, double saldoIniziale) {
		this.tipoConto = tipoConto;
		this.saldo = saldoIniziale;
		numeroConto=++numeroUltimoConto;
		}
	
	public void versa(double somma) {
		saldo+=somma;
		System.out.println("Versati: " +somma+ "euro");
	}
	
	public boolean preleva(double somma) {
		if (somma>saldo) {
			return false;
		}
		else {
			saldo-=somma;
			System.out.println("Prelevati: " +somma+ "euro");
			return true;
		}
	}
	
	public void maturaInteressi() {
		if( tipoConto.equals("Family") )saldo=saldo*(1.0+tassoFamily);
		else if( tipoConto.equals("Business") ) saldo=saldo*(1.0+tassoBusiness);
		else System.out.println("nessun tasso trovato");
	}
	
	public double ottieniSaldo() {
		return saldo;
	}
	
	public int ottieniNumero() {
		return numeroConto;
	}
	
	public String getTipoConto() { return tipoConto; }
	
}

