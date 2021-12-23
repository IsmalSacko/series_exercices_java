package fr.esic.execice;

import java.util.Scanner;

public class NombreComprisEntre5Et25 {

	public static void main(String[] args) {
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entre 5 et 25");
		
		nombre = sc.nextInt();
		while (nombre <= 5 || nombre >= 25) {
			if (nombre <= 5) {
			System.out.println("Le nombre saisi est plus petit que 5");			
			nombre = sc.nextInt();
		} else if(nombre >=25){
			System.out.println("Le nombre saisi est plus grand que 25 ou est égal à 25 lui-même");	
			nombre = sc.nextInt();
		}
		System.out.println("BRAVO, le nombre saisi (" +nombre+") est bien entre 5.");
	}

}
}
