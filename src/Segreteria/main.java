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
			
			
			int listaOperazioniStudente = inout.ottieniComando("Quale operazione vuoi fare?", "listaOperazioniStudente")-1;
			switch(listaOperazioniStudente) {
			//cerca iscrivi ritira visul iscritti visul laurati
			
			case 0 :
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
			case 1 :
				break;
			}
		}
	}
}
