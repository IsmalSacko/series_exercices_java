package fr.esic.execice;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ArretProgramme3TentativeErronee {

	public static void main(String[] args) {
		/**
		 * D�claration des variables (identifiant et passwort) � saisir par l'utisateur au clavier
		 */
		String password;
		String identifiant;
		/**
		 * On choisi 3 pour que l'utilisateur ait la possibilit� de 
		 * d'avoir 2 essais  apr�s le premier coup
		 */
		int  nbEssai = 3;
		Scanner sc = new Scanner(System.in);
		
		// On demande � l'utilisateur de saisir l'identifiant qui affich� � l'�cran (joelbanka@esic.fr)
		System.out.print("Veuillez saisir 'saismaila@esic.fr' comme  identifiant : ");
		
		// Affectation de la variable suite � la saisie de l'tulisateur au clavier
		identifiant = sc.nextLine();
		
		// On demande � l'utilisateur de saisir le mot de passe indiqu� � l'�cran (JOEL)
		System.out.print("Veuiller saisir 'SACKO' au manjuscule comme mot de passe : ");
		
		// Affectation de la variable suite � la saisie de l'tulisateur au clavier
		password = sc.nextLine();
		System.out.println("---------------------------------------------");
	
	/**
	 * On met en place nos structures conditionnelles avec la boucle while 
	 * (tant que l'identifiant et le mot de passe saisis ne sont identifiques �
	 * ceux indiqu�s, l'utilisateur contiuer � saisir jusqu'� ce qu'il y parvienne	
	 */
	while (!identifiant.equals("saismaila@esic.fr") || !password.equals("SACKO") && nbEssai >0) {
		//On d�cremente le nombre de tentative d'essai
		nbEssai = nbEssai-1;
		
		System.out.println("Idetifiant ou mot de passe incorrect et il vous reste "+ nbEssai +" essai (s) !");
		//Et le nombre d'essai atteint 0, on arrete le programmme.
		if (nbEssai ==0) {
			System.out.println("FINN DE PROGRAMME");
			System.exit(nbEssai);
		//Sinon, on continue � proposer � l'utilisateur de saisir l'identifiant et mot de passe
		}else {
			
			System.out.print("R�essayez l'identifiant ! : ");
			identifiant = sc.nextLine();
			System.out.print("R�essayez le mot de passe ! : ");
			password = sc.nextLine();
		}
	}
	// Et si tout se passe comme pr�vu, on lui indique que l'identifiant et le mot de passe saisis corrects
	System.out.println("Bravo, votre identifiant '"+identifiant+"' et votre mot de passe '"+password+"' sont corrects !");
	
	}


}
