package Segreteria;

public class Esame {
	//Attributi
	private String nome;
	private int id;
	private int voto;
	private int crediti;
	private Risultato risultato;
	
	public enum Risultato {SUPERATO, NON_SUPERATO;}
	
	//Getter e setter
	public String getNome() { return this.nome; }
	public int getId() { return this.id; }
	public Risultato getRisultato() { return risultato; }
	public int getCrediti() { return crediti; }
	public int getVoto() { return voto; }
	
	public void setNome(String nome) {this.nome = nome;}
	public void getId(int id) {this.id = id;}
	public void setVoto(int voto) { this.voto = voto; }
	public void setRisultato(Risultato risultato) {this.risultato = risultato;  }
	public void setCrediti(int crediti) {this.crediti = crediti;}
	
	
	
	//TODO finire di scrivere setter e la dichiarazione del metodo aggiungiEsameAlDatabase(CorsoLaurea c)
}
