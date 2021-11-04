package Segreteria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		InOut inout = new InOut();
		boolean exit =false;
		
		Database database = new Database();
		
		
		//operazioni studente
		
		while(!exit) {
			
			
			int listaOperazioniStudente = inout.ottieniComando("Quale operazione vuoi fare?", "listaOperazioniStudente");
			switch(listaOperazioniStudente) {
			//cerca iscrivi ritira visul iscittti visul laurati
			
			case Dictionary.comandList.CERCA_STUDENTE.getIndiceComando() :
			{
				System.out.println("Inserire nome:");
				String nomeStudente = input.nextLine();
				for( CorsoLaurea corso : database.getAteneo().keySet() )
				{
					if( corso.Cercare(nomeStudente)!=null )
					{
						System.out.println("Studente trovato!");
					}
					else 
					{
						System.out.println("Studente non trovato!");
					}
				}
				
			}
			case Dictionary.comandList.ISCRIVI.getIndiceComando() :
				break;
			}
		}
	}
}
