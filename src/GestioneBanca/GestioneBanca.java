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
		
		HashMap<Utente, ArrayList<ContoCorrente>> banca = new HashMap<Utente, ArrayList<ContoCorrente>>();	
		
		boolean login = false;
		boolean exit = false;
		
		while(!exit)
		{
			// Prima di effettuare il login
			while(!login && !exit) 
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
				
				if( banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])==null )
				{					
					if(listaOperazioniConto.equals("Apri conto")) 
					{
						// Apri conto
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
						ArrayList<ContoCorrente> listaConti = new ArrayList<ContoCorrente>();
						ContoCorrente cc = new ContoCorrente(tipoConto,saldo);
						terminale.aggiungiConto(cc, listaConti);
						banca.put(TerminaleSportello.getUserList()[terminale.getActiveUserId()] , listaConti);
					}
					else
					{
						System.out.println("Nessun conto aperto! Per poter fare qualsiasi cosa devi prima aprire un conto");
					}
				}
				
				else if(banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()])!=null)
				{
					switch(listaOperazioniConto) 
					{
					
					case "Apri conto":
					{
						System.out.println("- Apertura di un nuovo conto -");
						// Apri conto
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
						ContoCorrente cc = new ContoCorrente(tipoConto, saldo);
						terminale.aggiungiConto(cc, banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]));
					}
					break;
					
					// Versa una somma
					case "Versa" :
					{
						int versamento;
						do
						{
							System.out.println("Quanto si desidera versare?");
							versamento=input.nextInt();
						}while( versamento < 0 );
						int numeroConto=0;
						do
						{
							System.out.println("In quale conto?");
							System.out.println("Numero conti aperti: " + banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size());
							numeroConto=input.nextInt();
						}while( numeroConto<=0 && numeroConto > banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size() );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).get(numeroConto-1);
						cc.versa(versamento);
					}
					break;
			
					// Preleva una somma
					case "Preleva" :
					{
						int prelievo;
						do
						{
							System.out.println("Quanto si desidera prelevare?");
							prelievo=input.nextInt();
						}while( prelievo < 0 );
						int numeroConto=0;
						do
						{
							System.out.println("Da quale conto?");
							System.out.println("Numero conti aperti: " + banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size());
							numeroConto=input.nextInt();
						}while( numeroConto<=0 && numeroConto > banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size() );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).get(numeroConto-1);
						cc.preleva(prelievo);
					}
					break;
				
					// Stampa saldo
					case "Saldo" :
					{
						int numeroConto=0;
						do
						{
							System.out.println("Di quale conto?");
							System.out.println("Numero conti aperti: " + banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size());
							numeroConto=input.nextInt();
						}while( numeroConto<=0 && numeroConto > banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size() );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).get(numeroConto-1);
						System.out.println("Il saldo è di " + cc.ottieniSaldo() + " euro");
					}
					break;
					
					case "Numero conto corrente" :
					{
						int numeroConto=0;
						do
						{
							System.out.println("Di quale conto?");
							System.out.println("Numero conti aperti: " + banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size());
							numeroConto=input.nextInt();
						}while( numeroConto<=0 && numeroConto > banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).size() );
						ContoCorrente cc = banca.get(TerminaleSportello.getUserList()[terminale.getActiveUserId()]).get(numeroConto-1);
						System.out.println("Il numero di conto è: " + cc.ottieniNumero());
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
}
