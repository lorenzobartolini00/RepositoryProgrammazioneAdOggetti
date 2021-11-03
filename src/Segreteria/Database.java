package Segreteria;

import java.util.*;

public class Database {
	private static HashMap<CorsoLaurea, ArrayList<Esame>> ateneo = new HashMap<CorsoLaurea, ArrayList<Esame>>();
	
	Database()
	{
		//Corsi di laurea
		CorsoLaurea ingegneria = new CorsoLaurea("Ingegneria", 120);
		CorsoLaurea economia = new CorsoLaurea("Economia", 120);
		CorsoLaurea medicina = new CorsoLaurea("Medicina", 120);
		CorsoLaurea scienze = new CorsoLaurea("Scienze", 120);
		CorsoLaurea agraria = new CorsoLaurea("Agraria", 120);
		
		//Lista degli esami
		ArrayList<Esame> esami_ingengeria = new ArrayList<Esame>();
		ArrayList<Esame> esami_economia = new ArrayList<Esame>();
		
		//Esami
		//Ingegneria
		Esame analisi1 = new Esame("Analisi 1", 9);
		esami_ingengeria.add(analisi1);
		Esame geometria = new Esame("Geometria", 6);
		esami_ingengeria.add(geometria);
		Esame elDiInformatica = new Esame("Elementi di informatica", 9);
		esami_ingengeria.add(elDiInformatica);
		Esame analisi2 = new Esame("Analisi 2", 9);
		esami_ingengeria.add(analisi2);
		Esame fondDiElettromagnetismo = new Esame("Fondamenti di elettromagnetismo", 9);
		esami_ingengeria.add(fondDiElettromagnetismo);
		Esame fisica = new Esame("Fisica", 9);
		esami_ingengeria.add(fisica);
		Esame elettrotecnica = new Esame("Elettrotecnica", 9);
		esami_ingengeria.add(elettrotecnica);
		Esame economiaDellImpresa = new Esame("Economia dell'impresa", 9);
		esami_ingengeria.add(analisi1);
		Esame metodiMatematici = new Esame("Metodi matematici", 9);
		esami_ingengeria.add(analisi1);
		Esame fisicaSuperiore = new Esame("Fisica superiore", 9);
		esami_ingengeria.add(fisicaSuperiore);
		Esame chimica = new Esame("Chimica", 9);
		esami_ingengeria.add(chimica);
		Esame elDiElettronica = new Esame("Elementi di elettronica", 9);
		esami_ingengeria.add(elDiElettronica);
		Esame teoriaDeiSegnali = new Esame("Teoria dei segnali", 6);
		esami_ingengeria.add(teoriaDeiSegnali);
		Esame elDiControlliAutomatici = new Esame("Elementi di Controlli Automatici", 9);
		esami_ingengeria.add(elDiControlliAutomatici);
		Esame telecomunicazioni = new Esame("Telecomunicazioni", 9);
		esami_ingengeria.add(telecomunicazioni);
		Esame elettronicaAnalogica = new Esame("Elettronica analogica", 9);
		esami_ingengeria.add(elettronicaAnalogica);
		Esame misureElettroniche = new Esame("Misure elettroniche", 9);
		esami_ingengeria.add(misureElettroniche);
		Esame sistemiElettronici = new Esame("Sistemi elettronici", 6);
		esami_ingengeria.add(sistemiElettronici);
		Esame elettronicaDigitale = new Esame("Elettronica digitale", 9);
		esami_ingengeria.add(elettronicaDigitale);
		Esame programmazioneAdOggetti = new Esame("Programmazione ad oggetti", 9);
		esami_ingengeria.add(programmazioneAdOggetti);
		Esame sistemiDiTelecomunicazioni = new Esame("Sistemi di telecomunicazioni", 9);
		esami_ingengeria.add(sistemiDiTelecomunicazioni);
		Esame CADSP = new Esame("Circuiti e algoritmi per il digital signal processing", 6);
		esami_ingengeria.add(CADSP);
		
		
	}
}
