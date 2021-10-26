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
	
	//Getter
	public double getSaldo() { return saldo; }
	
	public int getNumero() { return numeroConto; }
	
	public String getTipoConto() { return tipoConto; }
	
	public void versa(double somma) {
		saldo+=somma;
		System.out.println("Versati: " +somma+ "euro");
	}
	
	//Metodi
	public boolean preleva(double somma) 
	{
		boolean result = false;
		if (result=somma<=saldo) 
		{
			saldo-=somma;
			System.out.println("Prelevati: " +somma+ "euro");
		}
			
		return result;
	}
	
	public void maturaInteressi() {
		if( tipoConto.equals("Family") )saldo=saldo*(1.0+tassoFamily);
		else if( tipoConto.equals("Business") ) saldo=saldo*(1.0+tassoBusiness);
	}
}

