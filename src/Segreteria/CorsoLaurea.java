package Segreteria;

import java.util.*;

public class CorsoLaurea {
	//TODO Aggiungere parametri, metodi, getter e setter
	
	//Attributi
	
	private String nome;
	private ArrayList<Studente> listaStudenti= new ArrayList<Studente>();
	private int numCrediti;
	
	//Costruttore
	CorsoLaurea(String nome, int numCrediti){
		this.nome=nome;
		this.numCrediti=numCrediti;
	}
	
	//Getter e Setter
	public String getNome() { return this.nome; }
	public int getNumCrediti() {return this.numCrediti;}
	public ArrayList<Studente> getListaStudenti() {return this.listaStudenti;}
	public void setNome(String nome) {this.nome=nome;}
	public void setNumMinCrediti(int numCrediti) {this.numCrediti=numCrediti;}
	public void setLista(ArrayList<Studente> listaStudenti) {this.listaStudenti=listaStudenti;}
	
	//Metodi
	public boolean Iscrivere(Studente studente) {
		boolean esito=false;
		if (!listaStudenti.contains(studente)) 
		{
			 esito=listaStudenti.add(studente);
		}
		return esito;
	}
	
	public boolean Cercare(Studente studente) {
		boolean esito=false;
		if(listaStudenti.contains(studente)) 
		   	{
			 esito=true;
		   	}
		return esito;
	}
	
	public boolean Ritirare(Studente studente) {
		return listaStudenti.remove(studente);
	}
	
	public void VisualizzaStudenti() {
		System.out.println(listaStudenti);
		if (listaStudenti.isEmpty()) {
			System.out.println("Nessun iscritto al corso");
		}
		
	}
	
	public void VisualizzaLaureati() {
		for(Studente studente:listaStudenti) 
		{
			if (studente.getIsLaureato()) 
			{
				System.out.println(studente);
			}
		}
	}
	

}
