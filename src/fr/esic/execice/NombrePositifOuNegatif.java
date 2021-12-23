package fr.esic.execice;

import java.util.Scanner;

public class NombrePositifOuNegatif {

	public static void main(String[] args) {
		//Déclaration de la variable nombre qui sera saisi par l'utilisateur
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		// Affectation de la variable suite à la saisie de l'tulisateur au clavier
		nombre= sc.nextInt();
		
		// Mise en place de structure conditionnelle
		if (nombre <0) {
			
			System.out.println("Le nombre " +nombre+", que vous avez saisi est négatif");
		}else if(nombre == 0) {
			System.out.println("Le nombre saisi est = "+nombre+ " (on laisse de côté le cas où le nombre vaut zéro)");
		}
		else {
			System.out.println("Le nombre " +nombre+", que vous avez saisi est positif");
		}

	}

}
