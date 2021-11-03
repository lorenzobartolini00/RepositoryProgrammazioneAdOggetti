package Segreteria;

import java.util.*;

public class Studente extends Persona {
	//Attributi
	private int matricola;
	private int crediti;
	private ArrayList<Esame> pianoStudi;
	private float mediaAritmetica=0;
	private int esamiSuperati=0;
	private int sommaVoti=0;
	
	//Costruttore
	Studente(String nome, String cognome, int matricola)
	{
		super(nome, cognome);
		this.matricola = matricola;
	}
	
	//Getter e setter, aggiungere setter pianoDiStudi
	public String getNome() { return super.nome; }
	public String getCognome() { return super.cognome; }
	public int getMatricola() { return this.matricola; }
	public ArrayList<Esame> getPianoStudi() { return pianoStudi; }
	public float getMediaAritmetica() { return this.mediaAritmetica; }
	public void setNome(String nome) { super.nome = nome; }
	public void setCognome(String cognome) { super.cognome = cognome; }
	public void setMatricola(int matricola) { this.matricola = matricola; }
	public void setMediaAritmetica(float mediaAritmetica) {this.mediaAritmetica= mediaAritmetica;}
	
	//Metodi
	public void creaPiano() 
	{
		pianoStudi = new ArrayList<Esame>();
	}
	
	public boolean aggiungiEsame(Esame esame) 
	{
		boolean esito = false;
		if(!this.isPresent(esame)) esito = pianoStudi.add(esame);
		return esito;
	}
	
	public boolean rimuoviEsame(Esame esame) 
	{
		return pianoStudi.remove(esame);
	}
	
	//Controlla se esame presente nella lista
	private boolean isPresent(Esame esame)
	{
		return pianoStudi.contains(esame);
	}
	
	//Cerca esame per nome
	public Esame cercaEsame(String nomeEsame)
	{
		Esame newEsame = null;
		for(Esame e : pianoStudi)
		{
			if( e.getNome().equals(nomeEsame) ) newEsame = e;
		}
		
		return newEsame;
	}
	
	//Cerca esame per numero identificativo
	public Esame cercaEsame(int id)
	{
		Esame newEsame = null;
		for(Esame e : pianoStudi)
		{
			if( e.getId()==id ) newEsame = e;
		}
		
		return newEsame;
	}
	
	public void visualizzaEsami()
	{
		for( Esame e : pianoStudi )
			if(e.getRisultato().equals(Esame.Risultato.SUPERATO))
			{
				InOut.stampaInColonna( e.getNome(), Integer.toString(e.getCrediti()), Integer.toString(e.getVoto()) );
			}
	}
	
	public void promuovere(Esame esame, int voto)
	{
		if(voto >= 18) 
			{
				esame.setVoto(voto);
				esame.setRisultato(Esame.Risultato.SUPERATO);
				esamiSuperati++;
				sommaVoti += esame.getVoto();
				mediaAritmetica = sommaVoti/esamiSuperati;
			}
	}
}
