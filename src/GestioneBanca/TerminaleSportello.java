package GestioneBanca;

import java.util.*;
import GestioneBanca.Utente;

public class TerminaleSportello {
	
	private int  idUtente;
	Scanner input= new Scanner(System.in);
	Utente[] listaUtenti;
	
	public TerminaleSportello(Utente[] utenti) {
		listaUtenti=utenti;

	}
	
	public boolean login() {
		boolean result = false;
		System.out.println("Inserisci Username");
		String name=input.nextLine();
		System.out.println("Inserisci Username");
		String password=input.nextLine();
		
		for(int i=0; i<=listaUtenti.length; i++) {
			if (listaUtenti[i].check(name, password)) {
				result  = true;
				idUtente = listaUtenti[i].getId();
			}
				
		}
		
		return result;
		
		
	}
}
