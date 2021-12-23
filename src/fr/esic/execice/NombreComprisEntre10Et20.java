package fr.esic.execice;

import java.util.Scanner;

public class NombreComprisEntre10Et20 {

	public static void main(String[] args) {
		int nombre ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entre 10 et 20");
		
		nombre = sc.nextInt();
		while (nombre <=10 || nombre >= 20) {
			if (nombre >= 20) {
				System.out.println("Plus petit !");
			
				nombre = sc.nextInt();
			}else {
				System.out.println("Plus grand !");
				
				nombre = sc.nextInt();
			}
			
		} 
		System.out.println("BRAVO, le nombre saisi (" +nombre+") est bien entre 10 et 20.");
	}

}
