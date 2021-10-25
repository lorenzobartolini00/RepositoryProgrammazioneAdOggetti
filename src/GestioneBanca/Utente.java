package GestioneBanca;

public class Utente {
	// Attributi
	private int idUtente;
	private String nomeUtente;
	private String password;
	
	// Attributi statici
	public static int idUltimo = 0;
	
	// Costruttore: inizializza nomeUtente e password
	public Utente(String nomeUtente, String password)
	{
		this.idUtente = idUltimo;
		idUltimo++;
		this.nomeUtente = nomeUtente;
		this.password = password;
	}
	
	// Getter e setter degli attributi privati
	public String getNomeUtente() {return nomeUtente;}
	public String getPassword() {return password;}
	public int getId() {return idUtente;}
	
	// Metodi
	
	// Controlla se il nome utente e la password passati corrispondono a quelli dell'utente
	public boolean check(String nomeUtente, String password)	
	{
		return this.nomeUtente.equals(nomeUtente) && this.password.equals(password);
	}
	
	// Cambia la password memorizzata se oldPassword coincide con l'ultima password memorizzata 
	public boolean changePassword(String oldPassword, String newPassword)
	{
		boolean result = false;
		
		if(result = oldPassword.equals(password))
		{
			password = newPassword;
		}
		
		return result;
	}
	
}
