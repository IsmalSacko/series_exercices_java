package fr.esic.execice;

import java.util.Scanner;

public class SurfaceRectangle {

	public static void main(String[] args) {
		// D�claration de variables en entier
		int longueur;
		int largeur;
		int surface;
		
		//Initialisatio du Scanner pour la saisie du longueur et la largeur
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuiller saisir un nombre pour la longueur du rectangle.");
		longueur = sc.nextInt();
			System.out.println("La longueur du rectangle est �gale � "+longueur);
			
			System.out.println();
		System.out.println("Veuiller saisir un nombre pour le largeur du rectange .");
		largeur = sc.nextInt();
			System.out.println("Le largeur du rectangle est �gale � "+largeur);
			
			//On calcule la surface du rectangle
			surface = longueur*largeur;
			System.out.println();
		System.out.println("La surface du rectange est �gale � "+surface+" m�");
	}

}
