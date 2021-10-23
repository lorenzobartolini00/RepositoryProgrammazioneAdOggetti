package GestioneBanca;

import java.util.Scanner;
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
		boolean login = false;
		
		while(!login) 
		{
			String listaOperazioniUtente;
			do {
				System.out.println("Quale operazione desidera fare?");
				Dictionary.stampaParoleConsentite("listaOperazioniUtente");
				listaOperazioniUtente=input.nextLine();
			}while(!Dictionary.verificaInserimento(listaOperazioniUtente, "listaOperazioniUtente"));
			
			switch(listaOperazioniUtente) {
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
			}
		}
		
		String listaOperazioniConto;
		do {
			System.out.println("Quale operazione desidera fare sul suo conto?");
			Dictionary.stampaParoleConsentite("listaOperazioniConto");
			listaOperazioniConto=input.nextLine();
		}while(!Dictionary.verificaInserimento(listaOperazioniConto, "listaOperazioniConto"));
		
		switch(listaOperazioniConto) 
		{
			case "Apri conto" : 
			{
				String tipoConto;
				do
				{
					System.out.println("Quale tipo di conto desidera aprire?");
					Dictionary.stampaParoleConsentite("tipoConto");
					tipoConto=input.nextLine();
				}while(!Dictionary.verificaInserimento(tipoConto, "tipoConto"));
				
				System.out.println("Quanto vuoi versare?");
				double saldo=input.nextDouble();
				ContoCorrente cc= new ContoCorrente(tipoConto,saldo);
				break;
			}
		}
	}
}
