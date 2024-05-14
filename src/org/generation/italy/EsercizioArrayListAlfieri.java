package org.generation.italy;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class EsercizioArrayListAlfieri {
	//inizio main
	public static void main(String[] args) {
		//dichiarazione dati
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int numeriGenerare;
		String risposta;
		//ciclo per restart
		do {
			ArrayList<Integer> numeri = new ArrayList<Integer>();
			System.out.println("Benvenuto nel programma di generazione numeri casuali, i numeri saranno generati da 0 a 1000.");
			//verifica validità numero inserito
			do {
				System.out.println("Inserisci quanti numeri casuali vuoi generare?");
				numeriGenerare = sc.nextInt();
				sc.nextLine();
				if (numeriGenerare < 0) {
					System.out.println("inserire un valore corretto");
				}
			} while (numeriGenerare < 0);
			//ciclo per creazione e aggiunta numeri all'arrayList
			for (int i = 0; i < numeriGenerare; i++) {
				int numeriRandom = r.nextInt(1000);
				numeri.add(numeriRandom);
				System.out.print("il " + (i + 1) + "° numero generato è: ");
				System.out.println(numeri.get(i));
			}
			//richiesta restart
			System.out.println("vuoi ricominciare?");
			risposta = sc.nextLine();
		} while (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("sì"));
		System.out.println("Arrivederci");

	}// fine main
	
}
