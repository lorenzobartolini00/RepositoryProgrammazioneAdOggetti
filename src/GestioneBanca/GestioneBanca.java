package GestioneBanca;

import GestioneBanca.TerminaleSportello;
import GestioneBanca.Utente;
import GestioneBanca.ContoCorrente;
import GestioneBanca.Dictionary;
import java.util.*;

public class GestioneBanca {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		TerminaleSportello terminale = new TerminaleSportello(utenti);
		@SuppressWarnings("unused")
		Dictionary dictionary = new Dictionary();
		
		HashMap<Utente, ArrayList<ContoCorrente>> banca = new HashMap<Utente, ArrayList<ContoCorrente>>();	
		
		boolean login = false;
		boolean exit = false;
		
		while(!exit)
		{
			// Prima di effettuare il login
			while(!login && !exit) 
			{
				System.out.println("- Accesso alla banca -");
				String listaOperazioniUtente = terminale.ottieniComando("Quale operazione desidera fare?", "listaOperazioniUtente");
				
				// Chiede all'utente se vuole registrarsi o uscire
				switch(listaOperazioniUtente) 
				{
				case "Login": 
					{
						if(login = terminale.login())System.out.println("Login effettuato."); 		//Chiama la funzione della classe terminale login, che ritorna true in caso di accesso effettuato, cioè nel caso in cui le credenziali inserite combacino con quelle di un utente inserito nella lista
						else System.out.println("Login non effettuato. Procedere con un nuovo tentativo.");		//Ritorna false nel caso in cui l'utente inserito non è presente nella lista di quelli che si sono registrati
						break;
					}
				case "Exit" :
				{
					exit = true;
					break;
				}
				
				}
			}
			
			//Salvo in una variabile l'utente attivo sul terminale
			Utente activeUser = TerminaleSportello.getUserList().get(terminale.getActiveUserId());
		
			// Dopo che il login è stato effettuato
			while(login && !exit)		//Si rimane in questo ciclo fintanto che non viene effettuato il Logout oppure l'uscita, tramite Exit. In caso di Logout si passa al ciclo while precedente, in caso di Exit il programma finisce
			{
				System.out.println("- Accesso al terminale -");
				String listaOperazioniConto = terminale.ottieniComando("Quale operazione desidera fare sul suo conto?", "listaOperazioniConto");
				boolean unContoAperto = banca.get(activeUser)!=null;
				
				switch(listaOperazioniConto) 
				{
					
				case "Apri conto":		
				{
					// Apri conto
					System.out.println("- Apertura di un nuovo conto -");
					
					String tipoConto = terminale.ottieniComando("Quale tipo di conto desidera aprire?", "tipoConto");
					double saldo = terminale.ottieniSommaPositiva("Quanto è il  saldo iniziale?");
						
					ContoCorrente cc = new ContoCorrente(tipoConto, saldo);	
					ArrayList<ContoCorrente> listaConti;
						
					if(unContoAperto)
					{
						listaConti = banca.get(activeUser);
					}

					else
					{
						listaConti = new ArrayList<ContoCorrente>();
						banca.put(activeUser, listaConti);
					}
					listaConti.add(cc);	
					unContoAperto = true;
					}
				break;
					
				// Versa una somma
				case "Versa" :
				{
					if(unContoAperto)
					{
						double versamento = terminale.ottieniSommaPositiva("Quanto si desidera versare?");
						int numeroConto = terminale.ottieniNumeroConto(banca, "In quale conto?");		//Poichè ciascun utente può avere più di un conto, bisogna chiedere all'utente su quale utente vuole eseguire le operazioni
						
						//Per fare un versamento occorre recuperare, tramite la funzione get di cui dispone la classe HashMap, la lista di conti corrente associata all'utente che ha fatto il login e poi eseguire su tale oggetto ArrayList la funzione get per recuperare l'elemento i-esimo della lista, dove i è scelto dall'utente
						//Da notare che la classe ArrayList è diversa dalla classe Array. Infatti questa non dispone della funzione length(), ma occorre usare la funzione size().
						//Inoltre non si usano le parentesi [] per accedere ad un elemento della lista, ma la funzione get(int index)
						ContoCorrente cc = banca.get(activeUser).get(numeroConto-1);		
						
						//Viene richiamata la funzione versa presente nella classe ContoCorrente
						cc.versa(versamento);
					}
						
				}								
				break;
			
					// Preleva una somma
				case "Preleva" :
				{
					if(unContoAperto)
					{
						double prelievo = terminale.ottieniSommaPositiva("Quanto si desidera prelevare?");
						int numeroConto = terminale.ottieniNumeroConto(banca, "Da quale conto?");
						ContoCorrente cc = banca.get(activeUser).get(numeroConto-1);
						cc.preleva(prelievo);		//Viene richiamata la funzione preleva presente nella classe ContoCorrente
					}
				}
				break;
				
					// Stampa saldo
				case "Saldo" :
				{
					if(unContoAperto)
					{
						int numeroConto = terminale.ottieniNumeroConto(banca, "Di quale conto?");
						ContoCorrente cc = banca.get(activeUser).get(numeroConto-1);
						System.out.println("Il saldo è di " + cc.ottieniSaldo() + " euro");		//Viene richiamata la funzione ottieniSaldo presente nella classe ContoCorrente
				
					}
				}
				break;
					
				case "Numero conto corrente" :
				{
					if(unContoAperto)
					{	
						int numeroConto = terminale.ottieniNumeroConto(banca, "Di quale conto?");
						ContoCorrente cc = banca.get(activeUser).get(numeroConto-1);
						System.out.println("Il numero di conto è: " + cc.ottieniNumero());		//Viene richiamata la funzione ottieniNumero presente nella classe ContoCorrente
					}
				}
				break;
					
				case "Matura interessi" :
				{
					if(unContoAperto)
					{
						int numeroConto = terminale.ottieniNumeroConto(banca, "Di quale conto?");
						ContoCorrente cc = banca.get(activeUser).get(numeroConto-1);
						cc.maturaInteressi();		//Viene richiamata la funzione maturaInteressi presente nella classe ContoCorrente
						System.out.println("Interessi maturati con tasso " + cc.getTipoConto() );
					}
				}
				break;
				
					// Esci dal terminale
				case "Logout" :
				{
					login = false;
					unContoAperto = true;
				}
				break;
					
					// Esci dal programma
				case "Exit" :
				{
					exit = true;
					unContoAperto = true;
					break;
				}
				
				}
				if(!unContoAperto)
				{
					System.out.println("Nessun conto aperto!");
				}
			}
		}
	}
}
