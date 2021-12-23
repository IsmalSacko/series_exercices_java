package fr.esic.execice;

public class PrixArticle {


	public static void main(String[] args) {
		// 20% de TVA en decimal 		
		float TVA = (float) 0.20;		
		
		String [] telephone = { "SAMSUNG A72" ,"SAMSUNG A72", "SAMSUNG A72"};
		//prix unitaire
		float samsungprixUnitaire = 200;
		//ttc du modèle samsung
		float samsungttc = samsungprixUnitaire*TVA;
		// Prix total TTC
		float samsungprixttc = samsungprixUnitaire+samsungttc;		
		
		System.out.println("Modèle = "+telephone[0]+"\r\n"+
				"Le nombre d’articles = "+ telephone.length+"\r\n"+
				"Prix hors taxe = " + samsungprixUnitaire+" €"+"\r\n"+
				"Prix total TTC = "+samsungprixttc+"\r\n"+
				"TVA = "+TVA+" (20% du prix unitaire)"
		);
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		String [] iphone8 = { "IPHONE8" ,"IPHONE8", "IPHONE8","IPHONE8"};
		//prix unitaire iphone8
		float iphonePrixUnitaire= 400;
		// ttc iphone8
		float iphonePrixttc = iphonePrixUnitaire*TVA;
		// Le prix total TTC du iphone8
		float iphonePrixToalttc = iphonePrixUnitaire+iphonePrixttc;
		System.out.println("Modèle = "+iphone8[0]+"\r\n"+
				"Le nombre d'articles = "+iphone8.length+"\r\n"+
				"Prix hors taxe = "+iphonePrixUnitaire+"\r\n"+
				"Prix total TTC = "+iphonePrixToalttc+"\r\n"+
				"TVA = "+TVA+" (20% du prix unitaire)"
		);

	}

}
