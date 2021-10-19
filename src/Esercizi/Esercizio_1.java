package Esercizi;

/*Scrivere un programma StampaZigZag che prevede un array di 10 numeri interi contenente
 *  valori a piacere (senza bisogno di chiederli all'utente) e ne stampa gli elementi 
 *  secondo il seguente ordine: il primo, l'ultimo, il secondo, il penultimo, il terzo, 
 *  il terz'ultimo, ecc... Il nome dell'array può essere scelto a piacere. 
 */

public class Esercizio_1 {
	public static void main(String[] args) {
		double[] num;
		num=new double[10];
		int a=0;
		int b=9;
		while (a!=b) {
			num[a]=Math.random();
			a++;
		}
		
		a=0;
		
		while (a<=b) {
			System.out.println(num[a]);
			System.out.println(num[b]);
			a++;
			b--;
		}
	}

}
