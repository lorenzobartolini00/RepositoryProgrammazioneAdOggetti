package es2;



import java.util.Scanner;



public class Es2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire frase: ");
		String frase = input.nextLine();
		System.out.println("Inserire parola: ");
		String parola = input.next();

		System.out.println(contaOccorrenze(frase, parola));
		input.close();
	}

	private static int contaOccorrenze(String frase, String parola)
	{
		int occorrenze = 0;
		int i=0;
		while(frase.indexOf(parola,i) != -1)
		{
			i=frase.indexOf(parola,i)+1;
			occorrenze++;
		}
		return occorrenze;
	}



}