package fr.esic.execice;

import java.util.Scanner;

public class ProduitPositifOuNegatif {

	public static void main(String[] args) {
		//D�claration des variables (nombre1 et nomnbre2 qui seront saisis par l'utilisateur
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un premier nombre");
		// Affectation de la variable suite � la saisie de l'tulisateur au clavier
		nombre1 = sc.nextInt();
		System.out.println("--------------------------------------------");
		
		System.out.println("Veuillez saisir un deuxi�me nombre");
		
		nombre2 = sc.nextInt();
		produit = nombre1 * nombre2;
		
		// Mise en place de structure conditionnelle
		if (produit <0) {
		/**
		 * Si le produit est inf�rieur ou �gal � 0,
		 *  alors le produit est n�gatif (-)	
		 */
			System.out.println("Le produit de " +nombre1+" et " +nombre2+" qui est "+produit+", est n�gatif !");
		}
		//Sinon si le produit vaut 0, on laisse tomber 
		else if(produit == 0){
			produit = 0;
			System.out.println("Le produit est null ! "+produit);
		}else {
			/**
			 * Sinon le produit le produit est positif (+)	
			 */
			System.out.println("Le produit de " +nombre1+" et " +nombre2+" qui est "+produit+", est positif !");
		
		
			
		}
	
	}
}