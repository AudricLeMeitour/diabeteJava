package diabeteJava;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		 
		 System.out.println("Quel est votre nom ?");
		 String reponseNom = reader.next();
		 
		 System.out.println("Quel est votre prénom ? ?");
		 String reponsePrenom = reader.next();
		 
		 System.out.println("Quel est votre N° de sécurité Social ?");
		 String reponseNSS = reader.next();
		 
		 System.out.println("Quel est votre Sexe ? (entrer 'H' pour homme ou 'F' pour femme)");
		 
		 String reponseSexe = "";
		 int i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("H") == 0 ) {
			 	reponseSexe = "Homme";
			 	i = 1;
			 }
				 else if (input.compareTo("F") == 0){
					 reponseSexe = "F";
					 i = 1;
				 } else {
					 System.out.println("Veuillez entrer une réponse valide");
				 	}
		 }
				 
		 
		 System.out.println("Quel age avez-vous ?");
		 String reponseAge = reader.next();
		 	
		 System.out.println("Quel est votre tour de taille ?");
		 String reponseTDT = reader.next();
		 
		 System.out.println("Faites-vous du sport plus de 30m/jour ? 'O' pour oui/'N' pour non");
		 String reponseActPhy = "";
		 
		 i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("O") == 0 ) {
				 reponseActPhy = "Oui";
			 	i = 1;
			 }
				 else if (input.compareTo("N") == 0){
					 reponseActPhy = "Non";
					 i = 1;
				 } else {
					 System.out.println("Veuillez entrer une réponse valide");
				 	}
		 }

		 System.out.println("Avez vous des antécedant de traitement anti hypertension artérielle ? 'O' pour oui/'N' pour non");
		 String reponseATCDAntiHTA = "";
		 
		 i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("O") == 0 ) {
				 reponseATCDAntiHTA = "Oui";
			 	i = 1;
			 }
				 else if (input.compareTo("N") == 0){
					 reponseATCDAntiHTA = "Non";
					 i = 1;
				 } else {
					 System.out.println("Veuillez entrer une réponse valide");
				 	}
		 }

		 System.out.println("Avez vous des antécedants familial de diabete ? 'O' pour oui/'N' pour non");
		 String reponseATCDDiabete = "";
		 
		 i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("O") == 0 ) {
				 reponseATCDDiabete = "Oui";
			 	i = 1;
			 }
				 else if (input.compareTo("N") == 0){
					 reponseATCDDiabete = "Non";
					 i = 1;
				 } else {
					 System.out.println("Veuillez entrer une réponse valide");
				 	}
		 }
		 
		 System.out.println("Avez vous des antécedants de glycemie superieur à la normale ? 'O' pour oui/'N' pour non");
		 String reponseATCDGlycemie = "";
		 
		 i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("O") == 0 ) {
				 reponseATCDGlycemie = "Oui";
			 	i = 1;
			 }
				 else if (input.compareTo("N") == 0){
					 reponseATCDGlycemie = "Non";
					 i = 1;
				 } else {
					 System.out.println("Veuillez entrer une réponse valide");
				 	}
		 }
		 
		 System.out.println("Quel est votre Indice de Masse Corporel?");
		 String reponseIMC = "";
		 
		 System.out.println("Mangez vous régulierment des légumes vert ? 'O' pour oui/'N' pour non");
		 String reponseLegumeVert = "";
		 
		 i = 0;
		 while (i == 0) {
			 String input = reader.next();
			 if (input.compareTo("O") == 0 ) {
				 reponseLegumeVert = "Oui";
			 	i = 1;
			 }
				 else if (input.compareTo("N") == 0){
					 reponseLegumeVert = "Non";
					 i = 1;
					 } else if(input.compareTo("N") == 0){
							 reponseLegumeVert = "Non";
							 i = 1;
						 } else {
						 System.out.println("Veuillez entrer une réponse valide");
					 	}
		 }
		  
		 reader.close();
		 
		 Critere critereIndividu = new Critere(reponseNom, reponsePrenom, reponseNSS, reponseSexe, reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie,reponseIMC, reponseLegumeVert);
		 
		 critereIndividu.AgeIndividu(reponseAge);
		 critereIndividu.Tourdt(reponseTDT);
		 critereIndividu.ActivitePhy(reponseActPhy);
		 critereIndividu.ATCDAntiHTA(reponseATCDAntiHTA);
		 critereIndividu.ATCDDiabete(reponseATCDDiabete);
		 critereIndividu.ATCDGlycePlus(reponseATCDGlycemie);
		 critereIndividu.IMC(reponseIMC);
		 critereIndividu.PartLegume(reponseLegumeVert);
		 
		 Resultat R = new Resultat (reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie,reponseIMC, reponseLegumeVert);
		 R.Somme(reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie, reponseIMC, reponseLegumeVert);

	 
	 }
}
	 

