package fr.esic.execice;

import java.util.Scanner;

public class OperationSurEntiers {	
	
	
public static void main(String[] args) {
	
/**
 * On unitialise le scanner
 */
	Scanner scanner = new Scanner(System.in);
	/**
	 * On a déclare nos deux variables pour pouvoir les utiliser après
	 */
	int nb1;
	int nb2;
	int somme;
	int quotient;
	int multiplication;
	
	//On demande à l'utilisateur de saisir une première valeur
	 
	System.out.println("Veuillez saisir un premier nombre");
	nb1 = scanner.nextInt();
	
	 //Et on affiche la valeur affectée
	 
	System.out.println("Votre première valeur saisie est : " +nb1);
	System.out.println("________________________________________");
	
	
	 // Ensuite on demande à l'utilisateur de saisir une deuxième valeur
	 
	System.out.println("Veuillez saisir un deuxième nombre");
	
	//Et on affiche la valeur affectée pour le deuxième aussi
	 
	nb2 = scanner.nextInt();
	System.out.println("Votre deuxième valeur saisie est : "+nb2);
	System.out.println("________________________________________");
	
	//Et la somme de ses deux valeurs est affichée
	somme = nb1+nb2;
	System.out.println("La somme de vos deux valeurs est : "+somme);
	System.out.println("________________________________________");
	//on calcul le quotient de nos 2 valeurs
	quotient = nb1/nb2;
	// On cherche mainntenant le produit du quotient et de la somme 
	multiplication = quotient*somme;
	System.out.println("Et le suotient de la somme est : "+quotient+", le produit du quotient et de la somme est :"+multiplication);

}
	
}
