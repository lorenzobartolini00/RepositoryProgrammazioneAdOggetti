package Segreteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class InOut {
	
	Scanner input= new Scanner(System.in);
	Segreteria.Dictionary dictionary = new Segreteria.Dictionary();
	//Metodi
	//TODO metodo che chiede all'utente di inserire Stringa, intero e controlla inserimento; metodo che stampa con system.out
	//TODO In futuro: Sostituire l'implementazione della classe InOut con interfaccia grafica
	
	//Stampa su un unica colonna le stringhe passate
	public static void stampaInColonna(String ... parole)
	{
		String stringaFinale = null;
		for( String s : parole) stringaFinale += s + " | " ;
		
		System.out.println(stringaFinale);
	}
		
	/*public String ottieniComando(String domanda, String contesto)
	{
		String risposta = new String();
		do {
			System.out.println(domanda);
			Dictionary.stampaParoleConsentite(contesto);
			risposta=input.nextLine();
		}while(!Segreteria.Dictionary.verificaInserimento(risposta, contesto));
			
		return risposta;
	}*/
	
	public int ottieniComando(String domanda, String contesto)
	{
		int risposta = -1;
		do {
			System.out.println(domanda);
			Dictionary.stampaParoleConsentite(contesto);
			risposta = input.nextInt();
			input.nextLine();
		}while(!Segreteria.Dictionary.verificaIndice(risposta, contesto));
		return risposta;
	}
		
	public double ottieniSommaPositiva(String domanda)
	{
		double risposta;
		do {
			System.out.println(domanda);
			risposta=input.nextDouble();
			input.nextLine();
		}while(risposta<0);
			
		return risposta;
	}
}
