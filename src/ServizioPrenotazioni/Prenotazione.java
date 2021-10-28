package ServizioPrenotazioni;

import java.util.Scanner;

public class Prenotazione {
	
    // una classe Prenotazione contenente il nome del cliente e l'ora della sua prenotazione.

	public static String nome;
	public static int oraArrivo;
	public static int oraFine;
	
	public Prenotazione(String nome,int oraArr, int oraFine) {
		
		this.nome=nome;
		this.oraArrivo=oraArr;
		this.oraFine=oraFine;
		
	}

}
