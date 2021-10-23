package GestioneBanca;

import java.util.*;
import java.util.HashMap;

public class Dictionary {
	// Dizionario: Associa ad ogni key di tipo String un value di tipo ArrayList, 
	// in cui sono contenute le parole consentite
	private static HashMap<String, ArrayList<String>> paroleConsentite = new HashMap<String, ArrayList<String>>();	
	
	Dictionary()
	{
		// Crea un oggetto ArrayList in cui inserisco le parole consentite per ogni "contesto"
		ArrayList<String> tipoConto = new ArrayList<>();
		tipoConto.add("Family");
		tipoConto.add("Business");
		ArrayList<String> listaOperazioniUtente = new ArrayList<>();
		listaOperazioniUtente.add("Login");
		listaOperazioniUtente.add("Sign in");
		ArrayList<String> listaOperazioniConto = new ArrayList<>();
		listaOperazioniConto.add("Apri conto");
		listaOperazioniConto.add("Versa");
		listaOperazioniConto.add("Preleva");
		listaOperazioniConto.add("Matura interessi");
		listaOperazioniConto.add("Cambia tasso di interesse");
		
		// Associo a ciascuna key il proprio value
		paroleConsentite.put("tipoConto", tipoConto);
		paroleConsentite.put("listaOperazioniUtente", listaOperazioniUtente);
		paroleConsentite.put("listaOperazioniConto", listaOperazioniConto);
	}
	
	// Getter e Setter
	public HashMap<String, ArrayList<String>> getParoleConsentite(){ return paroleConsentite; }
	
	// Metodi
	// Verifica che la stringa passata sia presente all'interno dell'ArrayList per quello specifico contesto
	public static boolean verificaInserimento(String parolaDaConfrontare, String contesto)
	{
		boolean result = false; 
		for( String s: paroleConsentite.get(contesto))
			{
				if(s.toString().equals(parolaDaConfrontare)) 
				{
					result = true;
				}
			}
		return result;
	}
	
	public static void stampaParoleConsentite(String contesto)
	{
		for( String s: paroleConsentite.get(contesto))
		{
			System.out.println("-" + s);
		}
	}
	

}
