package fr.esic.execice;

import java.util.Scanner;

public class NombreDeDepart {

	public static void main(String[] args) {
		// D�claration des variables 
		int nbDepart;
		int i ;
		
		// Appel au scanner
		Scanner sc = new Scanner(System.in);
		
		// On demande � l'utilisateur de saisir un nombre de d�part
		System.out.println("Siasissez un nombre de d�part");
		
		// Initialisaion des variables (nbdepart et i) par la saisie au clivier par l'utilisateur
		nbDepart = sc.nextInt();
		i = 0;
		System.out.println("les 10 nombres de d�prt sont :");
		/**
		 * On dira que 
		 * i = 0 � la base
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
