package fr.esic.execice;

import java.util.Scanner;

public class ComptBancaire {

	public static void main(String[] args) {
		// D�claration de variables en entier
		float solde;
		float montant;
		float nouveauSolde; //pour la faciliter le calcule de nouveau solde du compte apr�s le d�p�t de 100 �		
		//affectation de variables
		solde = 50;
		montant = 0;
		Scanner sc = new Scanner(System.in);
		//Affichage du solde initial de compte
		System.out.println("Vous aviez "+solde+" � sur votre compte actuellement.\r\n Maintenant, faites un de de 100 �");
		montant = sc.nextFloat();	
			System.out.println();
		
		while (!(montant == 100)) {
			System.out.println("Montant non autoris� !!!");
			System.out.println();
			System.out.println("Entrez un montant de 100 �");
			montant = sc.nextFloat();
		}
			//Affichage du montant du montant de d�p�t
			System.out.println("Vous venez de faire un d�pot de "+montant+" �.");
			
				System.out.println();
			//Addition de l'ancien solde et du nouveau solde apr�s le d�p�t
			nouveauSolde = solde+montant;
			//Affichage du nouveau montat du compte
			System.out.println("ET votre nouveau solde est :"+nouveauSolde+" �");
		
		
	}

}
