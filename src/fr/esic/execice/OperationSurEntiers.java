package fr.esic.execice;

import java.util.Scanner;

public class OperationSurEntiers {	
	
	
public static void main(String[] args) {
	
/**
 * On unitialise le scanner
 */
	Scanner scanner = new Scanner(System.in);
	/**
	 * On a d�clare nos deux variables pour pouvoir les utiliser apr�s
	 */
	int nb1;
	int nb2;
	int somme;
	int quotient;
	int multiplication;
	
	//On demande � l'utilisateur de saisir une premi�re valeur
	 
	System.out.println("Veuillez saisir un premier nombre");
	nb1 = scanner.nextInt();
	
	 //Et on affiche la valeur affect�e
	 
	System.out.println("Votre premi�re valeur saisie est : " +nb1);
	System.out.println("________________________________________");
	
	
	 // Ensuite on demande � l'utilisateur de saisir une deuxi�me valeur
	 
	System.out.println("Veuillez saisir un deuxi�me nombre");
	
	//Et on affiche la valeur affect�e pour le deuxi�me aussi
	 
	nb2 = scanner.nextInt();
	System.out.println("Votre deuxi�me valeur saisie est : "+nb2);
	System.out.println("________________________________________");
	
	//Et la somme de ses deux valeurs est affich�e
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
