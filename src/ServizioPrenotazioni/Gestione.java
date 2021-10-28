package ServizioPrenotazioni;

import java.util.Scanner;
import ServizioPrenotazioni.Campo;
import ServizioPrenotazioni.Prenotazione;

public class Gestione {
	
	
	
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		int oraFine;
		int oraArr;
		String nome;
		Campo campo=new Campo();
		String risposta;
		

		System.out.println("Quale operazione vorresti fare?");
		
		do{
		     risposta=input.nextLine();
			
		if(risposta.equals("Prenotare")) {
		    campo.addPrenotazione();
			}
		
		if(risposta.equals("Cancella Prenotazione")) {
			campo.removePrenotazione();
			}
		
		System.out.println("Quale operazione vorresti fare?");
		risposta=input.nextLine();
		
			
		}
		while (risposta!="exit");
		
	}
}

	

