package fr.esic.execice;

import java.util.Scanner;

public class MoyenneArthmetique {

	public static void main(String[] args) {
		// D�clararion de nos variables 
		int val1;
		int val2;
		int val3;
		//o pr�voit de calculer la somme de nos 3 valeurs afin de simplifier le calcul de leur moyenne
		int somme;
		
		// on initialisation du scanner 
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Veuillez saisir le prmeier nombre.");
	val1 = sc.nextInt();
		
	System.out.println("Premi�re valeur saisie est �gale � "+val1);
	
		
	System.out.println("------------------------------------------------------------------------------------");
	
	System.out.println("Veuillez saisir le deuxi�me nombre.");
	val2 = sc.nextInt();
		System.out.println("La deuxi�me vaeur saisie est �gale � "+val2);
		
	System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Veuillez saisir le troisi�me nombre.");
	val3 = sc.nextInt();
	System.out.println("La troisi�me valeur saisie est �gale � "+val3);
	
	System.out.println("------------------------------------------------------------------------------------");	
	somme = val1+val2+val3;
		System.out.println("La moyenne de nos trois valeurs saisies est �gale � "+somme/3);
	}
}
