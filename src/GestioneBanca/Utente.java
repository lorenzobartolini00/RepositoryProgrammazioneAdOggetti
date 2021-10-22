package GestioneBanca;

import GestioneBanca.ContoCorrente;

public class Utente {
	private int idUtente;
	private String nomeUtente;
	private String password;
	
	public static int idUltimo = 1000;
	
	public Utente(String nomeUtente, String password)
	{
		idUltimo++;
		this.idUtente = idUltimo;
		this.nomeUtente = nomeUtente;
		this.password = password;
	}
	
	public String getUsername(String password)
	{
		return nomeUtente;
	}
	
	public boolean controlla(String nomeUtente, String password)
	{
		if(this.nomeUtente.equals(nomeUtente) && this.password.equals(password)) return true;
		else return false;
	}
	
	public boolean changePassword(String oldPassword, String newPassword)
	{
		boolean result;
		
		if(oldPassword.equals(password))
		{
			password = newPassword;
			result = true;
		}
		else
		{
			result = false;
		}
		
		return result;
	}
	
	public String getNomeUtente() {
		return nomeUtente;
		}
	
	public String getPassword() {
		return password;
		}
	
	public int getId() {
		return idUtente;
		}
	
}
