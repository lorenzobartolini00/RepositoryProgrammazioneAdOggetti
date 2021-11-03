package Segreteria;

public class InOut {
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
	
	public static void stampa(String parola)
	{
		System.out.println(parola);
	}
}
