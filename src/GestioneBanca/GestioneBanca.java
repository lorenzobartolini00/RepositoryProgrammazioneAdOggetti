package GestioneBanca;

import GestioneBanca.TerminaleSportello;
import GestioneBanca.Utente;
import GestioneBanca.ContoCorrente;
import GestioneBanca.Dictionary;
import java.util.*;

public class GestioneBanca {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		Utente[] utenti = new Utente[10];
		TerminaleSportello terminale = new TerminaleSportello(utenti);
		Dictionary dictionary = new Dictionary();
		
		HashMap<Utente, ContoCorrente> banca = new HashMap<Utente, ContoCorrente>();	
		
		boolean login = false;
		boolean exit = false;
		
		while(!exit)
		{
			// Prima di effettuare il login
			while(!login) 
			{
				String listaOperazioniUtente;
				do {
					System.out.println("Quale operazione desidera fare?");
					Dictionary.stampaParoleConsentite("listaOperazioniUtente");
					listaOperazioniUtente=input.nextLine();
				}while(!Dictionary.verificaInserimento(listaOperazioniUtente, "listaOperazioniUtente"));
				
				// Chiede all'utente se vuole registrarsi o accedere
				switch(listaOperazioniUtente) 
				{
				case "Login": 
					{
						if(login = terminale.login())System.out.println("Login effettuato"); 
						else System.out.println("Utente non trovato. Occorre prima effettuare il Sign in.");
						break;
					}	
				case "Sign in": 
					{
						terminale.SignIn();
						break;
					}
				case "Exit" :
				{
					exit = true;
					login = true;
					break;
				}
				
				}
			}
		
			// Dopo che il login è stato effettuato
			while(login && !exit)
			{
				String listaOperazioniConto = new String();
				do {
					System.out.println("Quale operazione desidera fare sul suo conto?");
					Dictionary.stampaParoleConsentite("listaOperazioniConto");
					listaOperazioniConto=input.nextLine();
				}while(!Dictionary.verificaInserimento(listaOperazioniConto, "listaOperazioniConto"));
			
				switch(listaOperazioniConto) 
				{
				// Apri conto
				case "Apri conto" : 
				{
					if( banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])==null )
					{
						// Ogni utente può aprire solo un conto
						String tipoConto;
						do
						{
							System.out.println("Quale tipo di conto desidera aprire?");
							Dictionary.stampaParoleConsentite("tipoConto");
							tipoConto=input.nextLine();
						}while(!Dictionary.verificaInserimento(tipoConto, "tipoConto"));
						
						double saldo = 0;
						do
						{
							System.out.println("Quanto è il  saldo iniziale?");
							saldo=input.nextDouble();
						}while(saldo<0);
						ContoCorrente cc = new ContoCorrente(tipoConto,saldo);
						// Dopo aver creato il nuovo conto con i parametri inseriti dall'utente, associo l'utente al
						// suo conto corrente attraverso la mappa "banca". In questa implementazione ad ogni utente 
						// può essere associato un solo conto corrente.
						banca.put(TerminaleSportello.getUserList()[terminale.getActiveUserId()] , cc);
					}
					else System.out.println("Conto già aperto! Impossibile aggiungere più conti corrente ad uno stesso utente");
				}
				break;
				
				// Versa una somma
				case "Versa" :
				{
					if( banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])!=null )
					{
						int versamento;
						do
						{
							System.out.println("Quanto si desidera versare?");
							versamento=input.nextInt();
						}while( versamento < 0 );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]);
						cc.versa(versamento);
					}
					else System.out.println("Nessun conto aperto! Per poter fare qualsiasi cosa devi prima aprire un conto");
				}
				break;
			
				// Preleva una somma
				case "Preleva" :
				{
					if( banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])!=null )
					{
						int prelievo;
						do
						{
							System.out.println("Quanto si desidera prelevare?");
							prelievo=input.nextInt();
						}while( prelievo < 0 );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]);
						cc.preleva(prelievo);
					}
						else System.out.println("Nessun conto aperto! Per poter fare qualsiasi cosa devi prima aprire un conto");
				}
				break;
				
				// Stampa saldo
				case "Saldo" :
				{
					if( banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])!=null )
					{
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]);
						System.out.println("Il saldo è di " + cc.ottieniSaldo() + " euro");
					}
					else System.out.println("Nessun conto aperto! Per poter fare qualsiasi cosa devi prima aprire un conto");
				}
				break;
				
				// Esci dal terminale
				case "Logout" :
				{
					login = false;
				}
				break;
				
				}
			}
		}
	}
}
