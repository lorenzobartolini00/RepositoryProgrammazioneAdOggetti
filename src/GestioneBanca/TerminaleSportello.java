package GestioneBanca;

import java.util.*;
import GestioneBanca.Utente;

public class TerminaleSportello {
	// Attributi
	private int  idUtente;
	Scanner input= new Scanner(System.in);
	private static Utente[] listaUtenti;
	
	// Costruttore: prende in ingresso un array di utenti e inizializza l'attributo listaUtenti
	public TerminaleSportello(Utente[] utenti) 
	{
		listaUtenti=utenti;
		listaUtenti[0] = new Utente("placeholder", "placeholder");
	}
	
	public static Utente[] getListaUtenti() { return listaUtenti; }
	
	// Metodi
	
	// Esegue il login: chiede all'utente di inserire nomeUtente e password e resistuisce esito positivo se
	// le credenziali inserite combaciano con quelle di un utente presente nell'array, altrimenti esito negativo
	
	public boolean login() 
	{
		boolean result = false;
		
		System.out.println("- Accesso utente -");
		System.out.println("Inserisci Username");
		String name=input.nextLine();
		System.out.println("Inserisci Password");
		String password=input.nextLine();
		
		for(int i=0; i<listaUtenti.length && !result; i++) 
		{
			if (listaUtenti[i] != null)
			{
				if (listaUtenti[i].check(name, password)) 	// Richiama il metodo check() presente nella classe Utente
				{
					result  = true;
					idUtente = listaUtenti[i].getId();		// Una volta che l'utente è stato trovato, viene salvato il suo id nel terminale
				}
			}	
		}
		
		return result;
	}
	
	public void SignIn()
	{
		System.out.println("- Registrazione nuovo utente -");
		System.out.println("Inserisci Username: ");
		String newNome=input.nextLine();
		System.out.println("Inserisci Password: ");
		String newPassword=input.nextLine();
		
		Utente utente = new Utente(newNome, newPassword);
		listaUtenti[Utente.idUltimo] = utente;
		
	}
}
