package fr.esic.execice;

import java.util.Scanner;

public class IdenntifiantEtMotDePasse {

	public static void main(String[] args) {
		/**
		 * D?claration des variables (IDENTIFIANT et PASSWORD) ? saisir par l'utisateur au clavier
		 */
		final String IDENTIFIANT = "joelbanka@esic.fr";
		final String PASSWORD = "JOEL";
		Scanner sc = new Scanner(System.in);
		
		// On demande ? l'utilisateur de saisir l'identifiant qui affich? ? l'?cran (joelbanka@esic.fr)
		System.out.println("Veuillez saisir 'joelbanka@esic.fr' comme  identifiant");
		
		// Affectation de la variable suite ? la saisie de l'tulisateur au clavier
		String identifiant = sc.nextLine();
		System.out.println("--------------------------------------------");
		// On demande ? l'utilisateur de saisir le mot de passe indiqu? ? l'?cran (JOEL)
		System.out.println("Veuiller saisir 'JOEL' au manjuscule comme mot de passe");
		
		// Affectation de la variable suite ? la saisie de l'tulisateur au clavier
		String password = sc.nextLine();
		System.out.println("---------------------------------------------");
	
	/**
	 * On met en place nos structures conditionnelles avec la boucle while 
	 * (tant que l'identifiant et le mot de passe saisis ne sont identifiques?
	 * ceux indiqu?s, l'utilisateur contiuer ? saisir jusqu'? ce qu'il y parvienne	
	 */
	while (!identifiant.equals(IDENTIFIANT) ||!password.equals(PASSWORD)) {
		System.out.println("Idetifiant ou mot de passe incorrect !");
		System.out.println("R?essayez l'identifiant!");
		identifiant = sc.nextLine();
		System.out.println("R?essayez le mot de passe");
		password = sc.nextLine();
	}
	// Et si tout se passe comme pr?vu, on lui indique que l'identifiant et le mot de passe saisis corrects
	System.out.println("Bravo, votre identifiant "+identifiant+" et votre mot de passe "+password+" sont corrects !");
	}

}
