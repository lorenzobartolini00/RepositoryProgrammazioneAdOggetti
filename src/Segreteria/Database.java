package Segreteria;

import java.util.*;

public class Database {
	private static HashMap<CorsoLaurea, ArrayList<Esame>> ateneo = new HashMap<CorsoLaurea, ArrayList<Esame>>();
			
	//Lista degli esami
	private static ArrayList<Esame> esami_ingengeria = new ArrayList<Esame>();
	private static ArrayList<Esame> esami_economia = new ArrayList<Esame>();
			
	//Esami
	//Ingegneria
	Esame[] array_esami_ingengeria = new Esame[] {
			new Esame("Analisi 1", 9), 
			new Esame("Geometria", 6),
			new Esame("Elementi di informatica", 9),
			new Esame("Analisi 2", 9),
			new Esame("Fondamenti di elettromagnetismo", 9), 
			new Esame("Fisica", 9),
			new Esame("Elettrotecnica", 9),
			new Esame("Economia dell'impresa", 9),
			new Esame("Metodi matematici", 9),
			new Esame("Fisica superiore", 9),
			new Esame("Chimica", 9),
			new Esame("Elementi di elettronica", 9),
			new Esame("Teoria dei segnali", 6),
			new Esame("Elementi di Controlli Automatici", 9),
			new Esame("Misure elettroniche", 9),
			new Esame("Sistemi elettronici", 6),
			new Esame("Elettronica digitale", 9),
			new Esame("Programmazione ad oggetti", 9),
			new Esame("Sistemi di telecomunicazioni", 9),
			new Esame("Circuiti e algoritmi per il digital signal processing", 6)
			};
	
	Database()
	{
		esami_ingengeria.addAll(Arrays.asList(array_esami_ingengeria));
		ateneo.put(new CorsoLaurea("Ingegneria", 120), esami_ingengeria);
	}
	
	public HashMap<CorsoLaurea, ArrayList<Esame>> getAteneo() { return ateneo; }
}
