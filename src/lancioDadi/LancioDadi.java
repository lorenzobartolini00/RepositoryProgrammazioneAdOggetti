package lancioDadi;

import java.util.Random;
import java.util.Scanner;

public class LancioDadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 0;
		Random rand = new Random();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire numero di lanci: ");
		N = in.nextInt();
		
		int[] lanci = new int[N];
		
		for( int i=0 ; i<lanci.length; i++ )
		{
			lanci[i] = 1+rand.nextInt(5);
			System.out.println(lanci[i]);
		}
		
		stampaStatisticheLanci(lanci);
		
		in.close();
		
	}
	
	public static void stampaStatisticheLanci(int[] arr)
	{
		float somma = 0;
		int min=6, max=1;
		for( int a : arr )
		{
			if(a<min) min = a;
			if(a>max) max = a;
			somma += a;
		}
		
		System.out.println("La media è: " + somma/arr.length);
		System.out.println("Il minimo è " + min);
		System.out.println("Il massimo è " + max);	
	}
}
