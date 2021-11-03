package Segreteria;

import java.util.*;

public class Database {
	private static HashMap<CorsoLaurea, ArrayList<Esame>> ateneo = new HashMap<CorsoLaurea, ArrayList<Esame>>();
	
	Database()
	{
		CorsoLaurea ingegneria = new CorsoLaurea("Ingegneria", 120);
		CorsoLaurea economia = new CorsoLaurea("Economia", 120);
		CorsoLaurea medicina = new CorsoLaurea("Medicina", 120);
		CorsoLaurea scienze = new CorsoLaurea("Scienze", 120);
		CorsoLaurea agraria = new CorsoLaurea("Agraria", 120);
		
		ArrayList<Esame> esami_ingengeria = new ArrayList<Esame>();
		ArrayList<Esame> esami_economia = new ArrayList<Esame>();
		
		Esame analisi1 = new Esame("Analisi 1", 9);
		Esame geometria = new Esame("Geometria", 6);
		Esame elDiInformatica = new Esame("Elementi di informatica", 9);
		Esame analisi2 = new Esame("Analisi 2", 9);
		Esame fondDiElettromagnetismo = new Esame("Fondamenti di elettromagnetismo", 9);
		Esame fisica = new Esame("Fisica", 9);
		Esame elettrotecnica = new Esame("Elettrotecnica", 9);
		Esame economiaDellImpresa = new Esame("Economia dell'impresa", 9);
		Esame metodiMatematici = new Esame("Metodi matematici", 9);
		Esame fisicaSuperiore = new Esame("Fisica superiore", 9);
		Esame chimica = new Esame("Chimica", 9);
		Esame elDiElettronica = new Esame("Elementi di elettronica", 9);
		Esame teoriaDeiSegnali = new Esame("Teoria dei segnali", 6);
		Esame elDiControlliAutomatici = new Esame("Elementi di Controlli Automatici", 9);
		Esame telecomunicazioni = new Esame("Telecomunicazioni", 9);
		Esame elettronicaAnalogica = new Esame("Elettronica analogica", 9);
		Esame misureElettroniche = new Esame("Misure elettroniche", 9);
		Esame sistemiElettronici = new Esame("Sistemi elettronici", 6);
		Esame elettronicaDigitale = new Esame("Elettronica digitale", 9);
		Esame programmazioneAdOggetti = new Esame("Programmazione ad oggetti", 9);
		Esame sistemiDiTelecomunicazioni = new Esame("Sistemi di telecomunicazioni", 9);
		Esame CADSP = new Esame("Circuiti e algoritmi per il digital signal processing", 6);
		
		
	}
}
