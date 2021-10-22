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
		boolean login = false;
		//aggiungi metodo controlla
		while(login) {
			System.out.println("Quale operazione desidera fare?");
			inp=input.nextLine();
			switch(inp) {
				case "Login": if(terminale.login()) {
					System.out.println("Login effettuato");
					login = true;
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
		System.out.println("Quale operazione desidera fare sul suo conto?");
		inp=input.nextLine();
		switch(inp) {
			case "Apri Conto" : {
				System.out.println("Inserisci il tuo nome");
				String nome=input.nextLine();
				System.out.println("Quanto vuoi versare?");
				double saldo=input.nextDouble();
				ContoCorrente cc= new ContoCorrente(nome,saldo) ;
				}
		 
		}
		
	}

}
