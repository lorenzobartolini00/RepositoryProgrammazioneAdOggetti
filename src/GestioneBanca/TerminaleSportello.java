package GestioneBanca;

import java.util.*;
import GestioneBanca.Utente;
import GestioneBanca.Dictionary;

public class TerminaleSportello {
	Scanner input = new Scanner(System.in);
	Dictionary dictionary = new Dictionary();
	
	// Attributi
	private int  activeUserId;
	private static ArrayList<Utente> listaUtenti;
	
	
	// Costruttore: prende in ingresso un array di utenti e inizializza l'attributo listaUtenti
	public TerminaleSportello(ArrayList<Utente> utenti) 
	{
		listaUtenti=utenti;
	}
	
	public static ArrayList<Utente> getUserList() { return listaUtenti; }
	public int getActiveUserId() { return activeUserId; } 
	
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
		
		for(int i=0; i<listaUtenti.size() && !result; i++) 
		{
			if (listaUtenti.get(i) != null)
			{
				if (listaUtenti.get(i).check(name, password)) 	// Richiama il metodo check() presente nella classe Utente
				{
					result  = true;
					activeUserId = listaUtenti.get(i).getId();		// Una volta che l'utente è stato trovato, viene salvato il suo id nel terminale
					System.out.println("Il nuovo utente inserito ha il seguente id: " + listaUtenti.get(i).getId());
				}
			}	
		}
		
		if( !result )		//Se non è stato trovato nessun utente associato a quelle credenziali, permette di creare un nuovo utente senza inserire nuovamente le credenziali
		{
			String sceltaBinaria;
			do
			{
				System.out.println("Utente non trovato.");
				System.out.println("Si desidera creare un nuovo utente con le credenziali appena inserite?");
				Dictionary.stampaParoleConsentite("sceltaBinaria");
				sceltaBinaria=input.nextLine();
			}while( !Dictionary.verificaInserimento(sceltaBinaria, "sceltaBinaria") );
			
			if( sceltaBinaria.equals("Y") )
			{
				aggiungiUtente(name, password);
				System.out.println("Nuovo utente registrato.");
			}
		}
		
		return result;
	}
	
	//Funzione che resistuisce il numero di conto sulla quale devono essere eseguite operazioni, dopo averlo chiesto all'utente
	public int ottieniNumeroConto(HashMap<Utente, ArrayList<ContoCorrente>> banca, String richiesta)		
	{
		int numeroConto=0;
		do
		{
			System.out.println(richiesta);
			System.out.println("Numero conti aperti: " + banca.get(listaUtenti.get(activeUserId)).size());
			numeroConto=input.nextInt();
			input.nextLine();
		}while( numeroConto<=0 && numeroConto > banca.get(listaUtenti.get(activeUserId)).size() );
		
		return numeroConto;
	}
	
	public String ottieniComando(String domanda, String contesto)
	{
		String risposta = new String();
		do {
			System.out.println(domanda);
			Dictionary.stampaParoleConsentite(contesto);
			risposta=input.nextLine();
		}while(!Dictionary.verificaInserimento(risposta, contesto));
		
		return risposta;
	}
	
	public double ottieniSommaPositiva(String domanda)
	{
		double risposta;
		do {
			System.out.println(domanda);
			risposta=input.nextDouble();
			input.nextLine();
		}while(risposta<0);
		
		return risposta;
	}
	
	//Funzione che crea un nuovo utente e lo aggiunge alla lista
	private void aggiungiUtente(String name, String password)
	{
		Utente utente = new Utente(name, password);	
		listaUtenti.add(utente);
	}
	
	//Funzione che aggiunge alla lista dei conti che viene passata il conto corrente passato come parametro
	public void aggiungiConto(ContoCorrente cc, ArrayList<ContoCorrente> listaConti)
	{
		listaConti.add(cc);
	}
}
