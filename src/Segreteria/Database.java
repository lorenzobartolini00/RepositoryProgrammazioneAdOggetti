package Segreteria;

import java.util.*;

public class Database {
	private static HashMap<CorsoLaurea, ArrayList<Esame>> ateneo = new HashMap<CorsoLaurea, ArrayList<Esame>>();
	
	Database()
	{
		CorsoLaurea ingegneria = new CorsoLaurea();
		CorsoLaurea economia = new CorsoLaurea();
		CorsoLaurea medicina = new CorsoLaurea();
		CorsoLaurea scienze = new CorsoLaurea();
		CorsoLaurea agraria = new CorsoLaurea();
		
		ArrayList<Esame> esami_ingengeria = new ArrayList<Esame>();
		ArrayList<Esame> esami_economia = new ArrayList<Esame>();
		
		Esame analisi1 = new Esame("Analisi 1", 9);
		Esame geometria = new Esame();
		Esame elDiInformatica = new Esame();
		Esame analisi2 = new Esame();
		Esame fondDiElettromagnetismo = new Esame();
		Esame fisica = new Esame();
		Esame elettrotecnica = new Esame();
		Esame economiaDellImpresa = new Esame();
		Esame metodiMatematici = new Esame();
		Esame fisicaSuperiore = new Esame();
		Esame chimica = new Esame();
		Esame elDiElettronica = new Esame();
		Esame teoriaDeiSegnali = new Esame();
		Esame elDiControlliAutomatici = new Esame();
		Esame telecomunicazioni = new Esame();
		Esame elettronicaAnalogica = new Esame();
		Esame misureElettroniche = new Esame();
		Esame sistemiElettronici = new Esame();
		Esame elettronicaDigitale = new Esame();
		Esame programmazioneAdOggetti = new Esame();
		Esame analisi1 = new Esame();
		
	}
}
