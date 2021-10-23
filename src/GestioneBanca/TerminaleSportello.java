package GestioneBanca;

import java.util.*;
import GestioneBanca.Utente;

public class TerminaleSportello {
	// Attributi
	private int  idUtente;
	Scanner input= new Scanner(System.in);
	Utente[] listaUtenti;
	
	// Costruttore: prende in ingresso un array di utenti e inizializza l'attributo listaUtenti
	public TerminaleSportello(Utente[] utenti) 
	{
		listaUtenti=utenti;
	}
	
	// Metodi
	
	// Esegue il login: chiede all'utente di inserire nomeUtente e password e resistuisce esito positivo se
	// le credenziali inserite combaciano con quelle di un utente presente nell'array, altrimenti esito negativo
	
	public boolean login() 
	{
		boolean result = false;
		System.out.println("Inserisci Username");
		String name=input.nextLine();
		System.out.println("Inserisci Password");
		String password=input.nextLine();
		
		for(int i=0; i<=listaUtenti.length; i++) 
		{
			if (listaUtenti[i].check(name, password)) 	// Richiama il metodo check() presente nella classe Utente
			{
				result  = true;
				idUtente = listaUtenti[i].getId();
			}	
		}
		
		return result;
	}
}
