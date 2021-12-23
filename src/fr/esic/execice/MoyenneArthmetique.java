package fr.esic.execice;

import java.util.Scanner;

public class MoyenneArthmetique {

	public static void main(String[] args) {
		// Déclararion de nos variables 
		int val1;
		int val2;
		int val3;
		//o prévoit de calculer la somme de nos 3 valeurs afin de simplifier le calcul de leur moyenne
		int somme;
		
		// on initialisation du scanner 
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Veuillez saisir le prmeier nombre.");
	val1 = sc.nextInt();
		
	System.out.println("Première valeur saisie est égale à "+val1);
	
		
	System.out.println("------------------------------------------------------------------------------------");
	
	System.out.println("Veuillez saisir le deuxième nombre.");
	val2 = sc.nextInt();
		System.out.println("La deuxième vaeur saisie est égale à "+val2);
		
	System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Veuillez saisir le troisième nombre.");
	val3 = sc.nextInt();
	System.out.println("La troisième valeur saisie est égale à "+val3);
	
	System.out.println("------------------------------------------------------------------------------------");	
	somme = val1+val2+val3;
		System.out.println("La moyenne de nos trois valeurs saisies est égale à "+somme/3);
	}
}
