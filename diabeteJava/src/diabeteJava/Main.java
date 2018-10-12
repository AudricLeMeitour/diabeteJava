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
					 reponseSexe = "Femme";
					 i = 1;
			 	} 
			 else {
					 System.out.println("Veuillez entrer une réponse valide");
				}
		 }
				 
		 
		 System.out.println("Quel age avez-vous ?");
		 i = 0;
		 String reponseAge="";
		 while (i == 0) {
			 int temp = reader.nextInt();
			 if (temp < 45) {
				 reponseAge = "<45";
				 i = 1;
			 } else if (temp <=54) {
				 reponseAge = "45-54";
				 i = 1;
			 } else if (temp <= 64) {
				 reponseAge = "55-64";
				 i = 1;
			 } else if (temp > 64) {
				 reponseAge = ">64";
				 i = 1;
			 } 
		 }

		 System.out.println("Quel est votre tour de taille ?");
		 String reponseTDT ="";
		 i = 0;
		 while (i == 0) {
			 int temp = reader.nextInt();
			 if (reponseSexe == "Homme") {
				 if (temp < 94) {
					 reponseTDT = "<94";
					 i = 1;
				 } else if (temp >102) {
					 reponseTDT = ">102";
					 i = 1;
				 	}
				 else  {
					 reponseTDT = "94-102";
					 i = 1;
					 }
			 } 
			 else {
				 if (temp < 80) {
					 reponseTDT = "<80";
					 i = 1;
				 } else if (temp >88) {
					 reponseTDT = ">88";
					 i = 1;
				 } else {
					 reponseTDT = "80-88";
					 i = 1;
				 }
			 }
				 
		 } 

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
			 	} 
			 else {
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
			 	} 
			 else {
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
			 	} 
			 else {
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
		 i = 0;
		 String reponseIMC = "";
		 while (i == 0) {
		 	int temp = reader.nextInt();
			 if (temp < 25) {
				 reponseIMC = "<25";
				 i = 1;
			 	}
			 else if (temp > 30) {
				 reponseIMC = ">30";
				 i = 1;
			 	}
			 else {
				 reponseIMC = "25-30";
				 i = 1;
			 	}
			 
		}
		 
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
			 	} 
			 else {
				 System.out.println("Veuillez entrer une réponse valide");
			 	}
		 }
		  
		 reader.close();
		 
		 Critere critereIndividu = new Critere(reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie,reponseIMC, reponseLegumeVert);
		 Individu Indiv = new Individu(reponseNom, reponsePrenom, reponseNSS, reponseSexe);
		 
		 Resultat R = new Resultat (reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie,reponseIMC, reponseLegumeVert);
		 R.Somme(reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie, reponseIMC, reponseLegumeVert);

	 
	 }
}
	  

