package fr.esic.execice;

import java.util.Scanner;

public class NombreDeDepart {

	public static void main(String[] args) {
		// Déclaration des variables 
		int nbDepart;
		int i ;
		
		// Appel au scanner
		Scanner sc = new Scanner(System.in);
		
		// On demande à l'utilisateur de saisir un nombre de départ
		System.out.println("Siasissez un nombre de départ");
		
		// Initialisaion des variables (nbdepart et i) par la saisie au clivier par l'utilisateur
		nbDepart = sc.nextInt();
		i = 0;
		System.out.println("les 10 nombres de déprt sont :");
		/**
		 * On dira que 
		 * i = 0 à la base
          Tant que i < 10, alors
          i = i + 1
          et on affichera  nbdepart + i
		 */
		while (i < 10) {
			i = i + 1;
			System.out.println(nbDepart+i);
		}
		
	}

}
