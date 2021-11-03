package Segreteria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//operazioni studente
		
		boolean gotStudente = false;
		boolean exit = false;
		
		while(!exit)
		{
			// Prima di effettuare il login
			while(!gotStudente && !exit) 
			{
				String listaOperazioniStudente = InOut.ottieniComando("Quale operazione desidera fare?", "listaOperazioniStudente");
				
				// Chiede all'utente se vuole cercare uno studente o uscire
				switch(listaOperazioniStudente) 
				{
				case "Cerca": 
					{
						if(gotStudente = InOut.gotStudente())System.out.println("Studente trovato."); 		//Chiama la funzione della classe terminale login, che ritorna true in caso di accesso effettuato, cioè nel caso in cui le credenziali inserite combacino con quelle di un utente inserito nella lista
						else System.out.println("Studente non Trovato. Procedere con un nuovo tentativo.");		//Ritorna false nel caso in cui l'utente inserito non è presente nella lista di quelli che si sono registrati
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
