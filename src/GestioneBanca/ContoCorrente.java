package GestioneBanca;

public class ContoCorrente {
	
	private String name;
	private double saldo;
	private double tasso;
	private int numeroConto;
	private static int numeroUltimoConto;
	
	public ContoCorrente(String nome, double saldoIniziale) {
		name=nome;
		saldo=saldoIniziale;
		numeroConto=++numeroUltimoConto;
		}
	
	public void versa(double somma) {
		saldo+=somma;
		System.out.println("Versati:" +somma+ "euro");
	}
	
	public boolean preleva(double somma) {
		if (somma>saldo) {
			return false;
		}
		else {
			saldo-=somma;
			System.out.println("Prelevati:" +somma+ "euro");
			return true;
		}
	}
	
	public void maturaInteressi() {
		saldo=saldo*tasso;
	}
	
	public double ottieniSaldo() {
		return saldo;
	}
	
	public int ottieniNumero() {
		return numeroConto;
	}
	
}

