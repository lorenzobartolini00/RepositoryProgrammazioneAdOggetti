package Segreteria;

import java.util.*;

public class CorsoLaurea {
	//TODO Aggiungere parametri, metodi, getter e setter
	
	//Attributi
	
	private String nome;
	private ArrayList<Studente> listaStudenti;
	private int numCrediti;
	
	//Costruttore
	CorsoLaurea(String nome, ArrayList<Studente> listaStudenti, int numCrediti){
		this.nome=nome;
		this.listaStudenti=listaStudenti;
		this.numCrediti=numCrediti;
	}
	
	//getter
	public String getNome() { return this.nome; }
	public int getNumCrediti() {return this.numCrediti;}
	public ArrayList<Studente> getListaStudenti() {return this.listaStudenti;}
	public void setNome(String nome) {this.nome=nome;}
	public void setNumMinCrediti(int numCrediti) {this.numCrediti=numCrediti;}
	public void setLista(ArrayList<Studente> listaStudenti) {this.listaStudenti=listaStudenti;}
}
