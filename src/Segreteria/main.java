package Segreteria;
import Segreteria.Dic

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//operazioni studente
		
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

	}

}
