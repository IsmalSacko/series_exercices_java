package fr.esic.execice;

import java.util.Scanner;

public class IdenntifiantEtMotDePasse {

	public static void main(String[] args) {
		/**
		 * Déclaration des variables (identifiant et passwort) à saisir par l'utisateur au clavier
		 */
		String password;
		String identifiant;
		Scanner sc = new Scanner(System.in);
		
		// On demande à l'utilisateur de saisir l'identifiant qui affiché à l'écran (joelbanka@esic.fr)
		System.out.println("Veuillez saisir 'joelbanka@esic.fr' comme  identifiant");
		
		// Affectation de la variable suite à la saisie de l'tulisateur au clavier
		identifiant = sc.nextLine();
		System.out.println("--------------------------------------------");
		// On demande à l'utilisateur de saisir le mot de passe indiqué à l'écran (JOEL)
		System.out.println("Veuiller saisir 'JOEL' au manjuscule comme mot de passe");
		
		// Affectation de la variable suite à la saisie de l'tulisateur au clavier
		password = sc.nextLine();
		System.out.println("---------------------------------------------");
	
	/**
	 * On met en place nos structures conditionnelles avec la boucle while 
	 * (tant que l'identifiant et le mot de passe saisis ne sont identifiquesà
	 * ceux indiqués, l'utilisateur contiuer à saisir jusqu'à ce qu'il y parvienne	
	 */
	while (!identifiant.equals("joelbanka@esic.fr") ||!password.equals("JOEL")) {
		System.out.println("Idetifiant ou mot de passe incorrect !");
		System.out.println("Réessayez l'identifiant!");
		identifiant = sc.nextLine();
		System.out.println("Réessayez le mot de passe");
		password = sc.nextLine();
	}
	// Et si tout se passe comme prévu, on lui indique que l'identifiant et le mot de passe saisis corrects
	System.out.println("Bravo, votre identifiant "+identifiant+" et votre mot de passe "+password+" sont corrects !");
	}

}
