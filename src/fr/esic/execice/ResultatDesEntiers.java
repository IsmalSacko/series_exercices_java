package fr.esic.execice;

import java.util.Scanner;

public class ResultatDesEntiers {

	public static void main(String[] args) {
		// D�claration des variables 
		int nbDepart;
		int i;
		int somme;
		
		// Appel au scanner
		Scanner sc = new Scanner(System.in);
		
		// On demande � l'utilisateur de saisir un nombre de d�part
		System.out.println("Saisissez un nombre de d�part pour connaitre la somme des entiers de ce nombre");
		
		// Initialisaion des variables (nbdepart et i) par la saisie au clivier par l'utilisateur
		nbDepart = sc.nextInt();
		somme = 0;
		for (i=1; i <= nbDepart; i++ ) {
			
			somme = somme+i;
		}
		
		System.out.println("La somme des entiers de (1 � "+nbDepart+") est �gale � "+somme +" !");
	}

}
