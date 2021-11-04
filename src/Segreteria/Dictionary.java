package Segreteria;

import java.util.*;
import java.util.HashMap;

public class Dictionary {
	// Dizionario: Associa ad ogni key di tipo String un value di tipo ArrayList, 
	// in cui sono contenute le parole consentite
	private static HashMap<String, ArrayList<String>> paroleConsentite = new HashMap<String, ArrayList<String>>();	
	
	public static enum comandList {
		CERCA_STUDENTE("Cerca", 0),
		ISCRIVI("Iscrivi", 1),
		PRELEVA("Preleva", 2),
		VISUALIZZA_ISCRITTI("Visualizza iscritti", 3),
		VISUALIZZA_STUDENTI("Visualizza studenti", 4),
		EXIT_S("Esci", 5),
		
		CREA_PIANO("Crea piano", 0),
		AGGIUNGI("Aggiungi esame", 1),
		RIMUOVI("Rimuovi esame", 2),
		CERCA_ESAME("Cerca Esame", 3),
		VISUALIZZA("Visualizza esami", 4),
		PROMUOVI("Promuovi", 5),
		LAUREA("Laurea", 6),
		CAMBIA_STUDENTE("Cambia studente", 7),
		EXIT_E("Esci", 8),
		
		CONFERMA("Conferma", 0),
		RIFIUTA("Rifiuta", 1);
		
		private String comando;
		private int indice;
		
		private comandList(String comando, int indice)
		{
			this.comando = comando;
			this.indice = indice;
		}
		
		public String getStringComando() 
		{
			return this.comando;
		}
		
		public int getIndiceComando() 
		{
			return this.indice;
		}
		
	};
	
	Dictionary()
	{
		// Crea un oggetto ArrayList in cui inserisco le parole consentite per ogni "contesto"
		ArrayList<String> listaOperazioniStudente = new ArrayList<>();
		listaOperazioniStudente.add(comandList.CERCA_STUDENTE.getStringComando());
		listaOperazioniStudente.add(comandList.ISCRIVI.getStringComando());
		listaOperazioniStudente.add(comandList.PRELEVA.getStringComando());
		listaOperazioniStudente.add(comandList.VISUALIZZA_ISCRITTI.getStringComando());
		listaOperazioniStudente.add(comandList.VISUALIZZA_STUDENTI.getStringComando());
		listaOperazioniStudente.add(comandList.EXIT_S.getStringComando());
		ArrayList<String> listaOperazioniEsami = new ArrayList<>();
		listaOperazioniEsami.add(comandList.CREA_PIANO.getStringComando());
		listaOperazioniEsami.add(comandList.AGGIUNGI.getStringComando());
		listaOperazioniEsami.add(comandList.RIMUOVI.getStringComando());
		listaOperazioniEsami.add(comandList.CERCA_ESAME.getStringComando());
		listaOperazioniEsami.add(comandList.VISUALIZZA.getStringComando());
		listaOperazioniEsami.add(comandList.PROMUOVI.getStringComando());
		listaOperazioniEsami.add(comandList.LAUREA.getStringComando());
		listaOperazioniEsami.add(comandList.CAMBIA_STUDENTE.getStringComando());
		listaOperazioniEsami.add(comandList.EXIT_E.getStringComando());
		ArrayList<String> sceltaBinaria = new ArrayList<>();
		sceltaBinaria.add(comandList.CONFERMA.getStringComando());
		sceltaBinaria.add(comandList.RIFIUTA.getStringComando());
		
		// Associo a ciascuna key il proprio value
		paroleConsentite.put("listaOperazioniStudente", listaOperazioniStudente);
		paroleConsentite.put("listaOperazioniEsami", listaOperazioniEsami);
		paroleConsentite.put("sceltaBinaria", sceltaBinaria);
	}
	
	// Getter e Setter
	public HashMap<String, ArrayList<String>> getParoleConsentite(){ return paroleConsentite; }
	// Metodi
	// Verifica che la stringa passata sia presente all'interno dell'ArrayList per quello specifico contesto
	
	/*public static boolean verificaInserimento(String parolaDaConfrontare, String contesto)
	{
		boolean result = false; 
		for( int i=0; i<paroleConsentite.get(contesto).size() && !result; i++ )
			{
				if(paroleConsentite.get(contesto).get(i).toString().equals(parolaDaConfrontare)) 
				{
					result = true;
				}
			}
		return result;
	}*/
	
	public static void stampaParoleConsentite(String contesto)
	{
		for( String s: paroleConsentite.get(contesto))
		{
			System.out.println(Integer.toString(1 + paroleConsentite.get(contesto).indexOf(s)) +  ")" + s);
		}
	}
	
	public static boolean verificaIndice(int index, String contesto)
	{
		return (index > 0) && (index <= paroleConsentite.get(contesto).size());
	}

}
