package fr.esic.execice;

import java.time.LocalDate;
import java.util.Scanner;

public class MineurOuMajeur {

	public static void main(String[] args) {
		
		int anneeNaissance ;
		
		int curantYear =  LocalDate.now().getYear();
		//int courantYear =curentDate.getYear();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre ann�e de naissance pour savoir si vous �tes majeur mineur en France");
		
		anneeNaissance = sc.nextInt();
		
		int age = curantYear - anneeNaissance;
		if ( age >=18) {
			
			System.out.println("Waou, vous �tes majeur, et avez "+age+" ans");
			
			
		}else {
			System.out.println("Oups ! Vous �tes mineur parce que vous avez "+age+" ans");
			
		}

	}

}
