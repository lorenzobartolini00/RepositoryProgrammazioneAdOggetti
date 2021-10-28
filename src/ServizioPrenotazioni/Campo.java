package ServizioPrenotazioni;


import java.util.Scanner;

import ServizioPrenotazioni.Prenotazione;

public class Campo {
	
	int oraFine;
	int oraArr;
	String nome;
	Scanner input= new Scanner(System.in);

	public boolean addPrenotazione() {
		
		
		
		System.out.println("Inserire nome");
		nome=input.nextLine();
		System.out.println("Inserire ora di arrivo");
		oraArr=input.nextInt();
		System.out.println("Inserire orario di fine");
		oraFine=input.nextInt();
		
		if (oraArr>oraFine) {
			while(oraArr>oraFine) {
			System.out.println("Errore");
			System.out.println("Inserire ora di arrivo");
			oraArr=input.nextInt();
			System.out.println("Inserire orario di fine");
			oraFine=input.nextInt();
			return false;
			}
		}
		else{
		    Prenotazione utente = new Prenotazione(nome,oraArr,oraFine);
		}
		return true;
	}
	
	public boolean removePrenotazione() {
		

		System.out.println("Inserire nome");
		nome=input.nextLine();
		System.out.println("Inserire ora di arrivo");
		oraArr=input.nextInt();
		System.out.println("Inserire orario di fine");
		oraFine=input.nextInt();
		if (nome!=Prenotazione.nome) {
			System.out.println("Il nome non esiste nel terminale");
			return false;
		}
		if (oraArr!=Prenotazione.oraArrivo) {
			System.out.println("Il nome non esiste nel terminale");
			return false;
		}
		if (oraFine!=Prenotazione.oraFine) {
			System.out.println("Il nome non esiste nel terminale");
			return false;
		}
		return true;
		
		
	}
	
	
}
