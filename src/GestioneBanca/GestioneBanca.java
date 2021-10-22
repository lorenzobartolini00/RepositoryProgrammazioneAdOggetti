package GestioneBanca;

import java.util.Scanner;
import GestioneBanca.TerminaleSportello;
import GestioneBanca.Utente;
import GestioneBanca.ContoCorrente;

public class GestioneBanca {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String inp;
		Utente[] utenti = new Utente[100];
		TerminaleSportello terminale = new TerminaleSportello(utenti);
//aggiungi metodo controlla
		System.out.println("Quale operazione desidera fare?");
		inp=input.nextLine();
		switch(inp) {
			case "Login": if(terminale.login()) {
				System.out.println("Login effettuato");
			}
			case "Sign in": {
				System.out.println("Inserisci username e password");
				String newnome=input.nextLine();
				String newpassword=input.nextLine();
				Utente utente = new Utente(newnome, newpassword);
				utenti[Utente.idUltimo] = utente;
					
				
			}
		
		}
	}

}
