package fr.esic.execice;

import java.util.Scanner;

public class TableDeMultiplication {

	public static void main(String[] args) {
		// Déclaration de la variable nombre à saisir oar l'utilsateur au clavier
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		// On demande à l'utlisateur de saisir un nombre de son choix au clavier
		System.out.println("Veuillez saisir un nombre pour connaitre sa table de multiplication");
		nombre = sc.nextInt();
		// Et on affiche la table de mulptlication du nombre que l'utilisateur ait saisi au clav ier
		System.out.println("Table de multication de "+nombre);
		/**
		 *  On met en place notre logique pour faire en sorte qu'elle puisse calculer la table de 
		 *  multiplication du nombre saisi par l'utilisateur
		 *  Nous souhaiton réaliser cette tache avec la boucle for suivante
		*/
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(nombre+" X "+i+" = "+nombre*i );
		}

	}

}
